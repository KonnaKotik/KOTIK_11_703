package ru.itis.kpop.repositories;

import lombok.SneakyThrows;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.kpop.forms.PopularMerch;
import ru.itis.kpop.forms.UniqMerch;
import ru.itis.kpop.models.Basket;
import ru.itis.kpop.models.Merch;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class BasketRepositoryImpl implements BasketRepository {

    //language=sql
    private static final String SQL_Popular_Merch = "SELECT merch_id, count(merch_id) AS popular FROM basket_merch GROUP BY merch_id ORDER BY popular DESC;";

    private static final String INSERT_MERCH_IN_BASKET =
            "INSERT INTO basket_merch (basket_id, merch_id) VALUES ((SELECT \"id\" FROM basket WHERE user_id = ?),?);";
    //language=sql
    private static final String SQL_SELECT_MERCH_FROM_BASKET = "select *" +
            "from merch," +
            "     basket_merch," +
            "     basket\n" +
            "    where merch.id = basket_merch.merch_id" +
            "    AND basket_id = basket.id" +
            "    AND basket.user_id = ?;;";
    //language=sql
    private static final String SELECT_MERCH_BY_ID = "select * from merch where id = ?;";
    private static final String SELECT_USERS_MERCH = "select * from bascket_merch where bascket_id = ?";

    //language=sql
    private static final String SELECT_COUNT = "SELECT merch.id, merch.name_merch, merch.img, merch.price, count(merch.name_merch) as row_count " +
            "FROM merch, basket_merch, basket WHERE merch.id = basket_merch.merch_id " +
            "AND basket.id = basket_merch.basket_id AND basket.user_id = ? GROUP BY merch.id;";

   /* //language=sql
    private static final String SQL_DELETE_MERCH = "DELETE * FROM basket_merch WHERE  "*/

    private JdbcTemplate jdbcTemplate;
    public BasketRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private RowMapper<Merch> merchRowMapper = (resultSet, i) -> Merch.builder()
            .id(resultSet.getLong("id"))
            .name(resultSet.getString("name_merch"))
            .price(resultSet.getDouble("price"))
            .img(resultSet.getString("img"))
            .build();

    private RowMapper<UniqMerch> uniqMerchRowMapper = (resultSet, i) -> UniqMerch.builder()
            .idMerch(resultSet.getLong("id"))
            .nameMerch(resultSet.getString("name_merch"))
            .countMerch(resultSet.getInt("row_count"))
            .img(resultSet.getString("img"))
            .price(resultSet.getDouble("price"))
            .build();

    private RowMapper<PopularMerch> popularMerchRowMapper = (resultSet, i) -> PopularMerch.builder()
            .idMerch(resultSet.getLong("merch_id"))
            .rating(resultSet.getInt("popular"))
            .build();


   @SneakyThrows
    @Override
    public void addMerchInBasket(Merch merch, Long userId) {
       jdbcTemplate.update(INSERT_MERCH_IN_BASKET, userId, merch.getId());

    }

    @Override
    public Merch findInBuscketByIn(Long id) {
     //   return jdbcTemplate.query();
        return null;

    }

    @Override
    public List<Merch> userMerch(Long basket_id) {
        return jdbcTemplate.query(SELECT_USERS_MERCH, merchRowMapper, basket_id);
    }

    @Override
    public List<Merch> getMerchsByUserId(Long user_id) {
        return jdbcTemplate.query(SQL_SELECT_MERCH_FROM_BASKET, merchRowMapper, user_id);
    }

    @Override
    public List<UniqMerch> getCoutMarch(Long user_id) {
        return jdbcTemplate.query(SELECT_COUNT, uniqMerchRowMapper, user_id );
    }

    @Override
    public void deleteMerchInBasket(Merch merch, Long userId) {

    }

    @Override
    public List<PopularMerch> getPopularMerch() {
        return jdbcTemplate.query(SQL_Popular_Merch, popularMerchRowMapper);
    }

    @Override
    public List<Merch> getMerchById(List<PopularMerch> popularMerch) {
       List<Merch> merches = new ArrayList<>();
        for (PopularMerch pMerch: popularMerch) {
            merches.add(jdbcTemplate.queryForObject(SELECT_MERCH_BY_ID, merchRowMapper, pMerch.getIdMerch()));
        }

        return merches;
    }

    @Override
    public List<UniqMerch> getUniqMerchById(List<PopularMerch> popularMerches) {
        List<UniqMerch> merches = new ArrayList<>();
        for (PopularMerch pMerch: popularMerches) {
            merches.add(jdbcTemplate.queryForObject(SELECT_MERCH_BY_ID, uniqMerchRowMapper, pMerch.getIdMerch()));
        }

        return merches;
    }

    @Override
    public void save(Basket model) {

    }

    @Override
    public Basket find(Long id) {
        return null;
    }

    @Override
    public List<Basket> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Basket model) {

    }

//    @Override
//    public Basket findUserBasket(Long id) {
//        return (Basket) jdbcTemplate.query(SQL_SELECT_GET_USER_BASKET_BY_ID, merchRowMapper, id);
//    }
}
