package ru.eremin.re.server;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor Eremin Artem on 27.04.2019.
 */

@RestController
public class UserController {

    @GetMapping(path = "/userJSON", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserJSON() {
        return new User("User JSON");
    }

    @GetMapping(path = "/userXML", produces = MediaType.APPLICATION_XML_VALUE)
    public User getUserXML() {
        return new User("User XML");
    }

    @PostMapping(path = "/userPost",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User userPost(@RequestBody final User user) {
        return user;
    }

}
