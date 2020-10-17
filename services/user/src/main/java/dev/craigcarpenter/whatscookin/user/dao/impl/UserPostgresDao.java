package dev.craigcarpenter.whatscookin.user.dao.impl;

import dev.craigcarpenter.whatscookin.user.dao.UserDao;
import dev.craigcarpenter.whatscookin.user.model.WCUser;
import org.springframework.stereotype.Repository;

@Repository
public class UserPostgresDao implements UserDao {

    @Override
    public int insert(WCUser user) {
        return 0;
    }
}
