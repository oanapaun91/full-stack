package com.example.curs16;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class UserLogin {
    @NotNull(message = "Nu poate fi null")
    @NotBlank(message = "lastName must be a non-empty string")
    @Email(message = "nu are formatul corect")
    String email;
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",
            message = "password must have digit + lowercase + uppercase + punctuation + symbol")
    String password;

    public UserLogin(String email, String password){
        this.email = email;
        this.password = password;
    }
}
