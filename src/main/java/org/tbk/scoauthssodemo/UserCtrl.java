package org.tbk.scoauthssodemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserCtrl {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
