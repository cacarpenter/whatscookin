package dev.craigcarpenter.whatscookin.auth.api;

import dev.craigcarpenter.whatscookin.auth.model.WCUser;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping
    public void postUser(@Validated WCUser user) {

    }
}
