package ru.itis.kpop.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.kpop.models.Merch;

import javax.sql.DataSource;
import java.util.List;

public class MerchRepositoryImpl implements MerchRepository {

    private JdbcTemplate jdbcTemplate;

    //language=SQL
    private static final String SQL_GET_ALL_MERCH = "SELECT id, name_merch, price FROM merch";


    public MerchRepositoryImpl(DataSource dataSource) {this.jdbcTemplate = new JdbcTemplate(dataSource);}

    private RowMapper<Merch> merchRowMapper = (resultSet, i) -> Merch.builder()
            .id(resultSet.getLong("id"))
            .name(resultSet.getString("name_merch"))
            .price(resultSet.getDouble("price"))
            .img(resultSet.getString("img"))
            .build();


    @Override
    public List<Merch> getAll() {
        return jdbcTemplate.query(SQL_GET_ALL_MERCH, merchRowMapper);
    }

    @Override
    public void save(Merch model) {

    }

    @Override
    public Merch find(Long id) {
        return null;
    }

    @Override
    public List<Merch> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Merch model) {

    }
}
