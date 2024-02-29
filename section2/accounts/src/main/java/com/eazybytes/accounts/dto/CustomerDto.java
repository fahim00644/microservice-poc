package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name Field Should not be empty")
    @Size(min = 5, max = 30, message = "The length of name should be between 5 and 30")
    private String name;

    @NotEmpty(message = "Email Field Should not be empty")
    @Email(message = "Email should be in valid format")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number should be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
