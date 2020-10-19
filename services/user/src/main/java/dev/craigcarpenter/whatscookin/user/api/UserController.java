package dev.craigcarpenter.whatscookin.user.api;

import dev.craigcarpenter.whatscookin.user.model.WCUser;
import dev.craigcarpenter.whatscookin.user.svc.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping(value = "/v1")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Inject
    private UserService userService;

    @PostMapping(value = "/users")
    public WCUser postUser(@Validated @RequestBody WCUser user) {
        log.info("postUser {}", user.getUsername());
        return userService.createUser(user);
    }
}
