package ru.itis.kpop.repositories;

import lombok.SneakyThrows;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.kpop.models.User;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class UsersRepositoryJdbcTemplateImpl implements UsersRepository {

    private JdbcTemplate jdbcTemplate;
//    private BasketRepository basketRepository;
//
    private Connection connection;
    private Statement statement;
    private static final String URL = "jdbc:postgresql://localhost:5432/k_popm";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";


    //language=SQL
    private static final String SQL_SELECT_USER_BY_ID =
            "select * from k_pop_user where id = ?;";

    //language=SQL
    private static final String SQL_SELECT_COOKIE =
            "SELECT k_pop_user.* FROM k_pop_user, auth WHERE k_pop_user.id = user_id AND cookie_value = ?;";

    //language=SQL
    private static  final String SQL_SELECT_USER_BY_EMAIL = "SELECT * FROM k_pop_user WHERE email = ?;";

    //language=SQL
    private static final String SQL_INSERT_NEW_BASKET = "INSERT INTO basket(user_id) values(?);";



    //language=SQL
    private static final String SQL_SELECT_ALL_USERS =
            "select * from k_pop_user;";

    //language=SQL
    private static final String SQL_INSERT =
            "insert into k_pop_user(email, hash_password, first_name, last_name) values (?, ?, ?, ?);";

    //language=SQL
    private static final String SQL_SELECT_BY_NAME =
            "select * from k_pop_user where email = ?;";

    @SneakyThrows
    public UsersRepositoryJdbcTemplateImpl(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        statement = connection.createStatement();

    }

    private RowMapper<User> userRowMapper = (resultSet, i) -> User.builder()
            .id(resultSet.getLong("id"))
            .email(resultSet.getString("email"))
            .hashPassword(resultSet.getString("hash_password"))
            .firstName(resultSet.getString("first_name"))
            .lastName(resultSet.getString("last_name"))
            .address(resultSet.getString("address"))
            .fandom(resultSet.getString("fandom"))
            .build();

    private RowMapper<Long> userIdRowMapper = ((resultSet, i) -> resultSet.getLong("user_id"));

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL_USERS, userRowMapper);
    }

    @Override
    public User find(Long id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_USER_BY_ID,
                userRowMapper, id);
    }

    @Override
    public void save(User model) {
        jdbcTemplate.update(SQL_INSERT, model.getEmail(), model.getHashPassword(), model.getFirstName(), model.getLastName());
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public User findOneByEmail(String email) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_BY_NAME, userRowMapper, email);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public Long finByCookie(String cookie) {
        return jdbcTemplate.queryForObject(SQL_SELECT_COOKIE, userRowMapper, cookie).getId();
    }

    @Override
    public void createNewBasket(String email) {
        User user = jdbcTemplate.queryForObject(SQL_SELECT_USER_BY_EMAIL, userRowMapper, email);
        jdbcTemplate.update(SQL_INSERT_NEW_BASKET, user.getId());
    }

//    @Override
//    @SneakyThrows
//    public Long finByCookie(String cookie) {
//
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM auth WHERE cookie_value = '" + cookie + "';");
//        resultSet.next();
//        Long id = resultSet.getLong("user_id");
//        User user = jdbcTemplate.queryForObject(SQL_SELECT_USER_BY_ID,
//                userRowMapper, id);
//        basketRepository.findUserBasket(user.getId());
//        user.setBasket(basketRepository.findUserBasket(user.getId()));
//        return user;
//    }
}
