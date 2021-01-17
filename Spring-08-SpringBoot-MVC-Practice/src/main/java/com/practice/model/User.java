package com.practice.model;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private boolean graduated;
    private String state;
}
