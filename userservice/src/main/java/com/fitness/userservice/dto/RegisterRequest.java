package com.fitness.userservice.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message= "Password must have at least 6 character")
    private String password;
    private String firstName;
    private String lastName;

}
