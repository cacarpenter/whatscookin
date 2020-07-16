package dev.craigcarpenter.whatscookin.auth.api;

import dev.craigcarpenter.whatscookin.auth.model.WCUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @PostMapping(value = "/users")
    public void postUser(@Validated @RequestBody WCUser user) {
      log.info("postUser");
      log.info(user.getName());
    }
}
