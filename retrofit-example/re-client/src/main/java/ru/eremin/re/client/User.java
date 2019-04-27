package ru.eremin.re.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * @autor Eremin Artem on 27.04.2019.
 */

@Getter
@Setter
@NoArgsConstructor
public class User {

    private String id = UUID.randomUUID().toString();

    private String name;

    public User(final String name) {
        this.name = name;
    }

}
