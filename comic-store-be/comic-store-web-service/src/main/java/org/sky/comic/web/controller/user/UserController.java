package org.sky.comic.web.controller.user;

import org.sky.comic.common.rest.ResponseEntityBuilder;
import org.sky.comic.common.rest.RestBody;
import org.sky.comic.core.domain.User;
import org.sky.comic.core.service.user.IUserService;
import org.sky.comic.core.service.user.exception.DuplicatedEmailException;
import org.sky.comic.web.controller.user.dto.register.RegisterParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("register")
    public ResponseEntity<RestBody> register(@RequestBody RegisterParam param) {
        var user = new User();
        try {
            userService.insert(user);
        } catch (DuplicatedEmailException e) {
            return ResponseEntityBuilder.status(HttpStatus.BAD_REQUEST).code("USER_EMAIL_EXISTS").build();
        }
        return null;
    }

}
