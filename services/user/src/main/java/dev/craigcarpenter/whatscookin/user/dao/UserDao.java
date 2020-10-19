package dev.craigcarpenter.whatscookin.user.dao;

import dev.craigcarpenter.whatscookin.user.model.WCUser;

public interface UserDao {
    WCUser insert(WCUser user);
}
