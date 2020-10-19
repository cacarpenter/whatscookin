package dev.craigcarpenter.whatscookin.user.svc.impl;

import dev.craigcarpenter.whatscookin.user.dao.UserDao;
import dev.craigcarpenter.whatscookin.user.model.WCUser;
import dev.craigcarpenter.whatscookin.user.svc.UserService;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserServiceImpl implements UserService {

    @Inject private UserDao userDao;

    @Override
    public WCUser createUser(WCUser user) {
        return userDao.insert(user);
    }
}
