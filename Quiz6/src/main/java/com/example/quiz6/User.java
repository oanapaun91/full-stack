package com.example.quiz6;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class User {

    @NotNull(message = "firstname not null")
    @NotBlank(message = "firstName must be a non-empty string")
    private String firstName;
    @NotNull(message = "lastname not null")
    @NotBlank(message = "flast Name must be a non-empty string")
    private String lastName;
    @NotNull(message = "email not null")
    @NotBlank(message = "email not blank")
    @Pattern(regexp = "^(.+)@(.+)$", message = "email must contain @ and .")
    private String email;
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",
            message = "password must have digit + lowercase + uppercase + punctuation + symbol")
    private String password;
}