package dev.craigcarpenter.whatscookin.user.dao.impl;

import dev.craigcarpenter.whatscookin.user.dao.UserDao;
import dev.craigcarpenter.whatscookin.user.model.WCUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserPostgresDao /*extends JdbcDaoSupport*/ implements UserDao {

    private static final Logger log = LoggerFactory.getLogger(UserPostgresDao.class);

    private static final RowMapper<WCUser> WC_USER_ROW_MAPPER =
            (r, rs) -> new WCUser().setId(r.getInt("id")).setUsername(r.getString("username"));


    private NamedParameterJdbcTemplate jdbcTemplate;

    @Inject
    public UserPostgresDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public WCUser insert(WCUser user) {
        log.debug("insert");
        MapSqlParameterSource params = new MapSqlParameterSource("username", user.getUsername());
        WCUser inserted = new WCUser();
        inserted.setUsername(user.getUsername());
        jdbcTemplate
                .query(
                        "INSERT INTO wc_user (username) VALUES (:username) RETURNING id",
                        params, resultSet -> {
                            inserted.setId(resultSet.getInt(1));
                        });
        return inserted;
    }
}
