package dev.craigcarpenter.whatscookin.user.svc;

import dev.craigcarpenter.whatscookin.user.model.WCUser;

public interface UserService {
    WCUser createUser(WCUser user);
}
