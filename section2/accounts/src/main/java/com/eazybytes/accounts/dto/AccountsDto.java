package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account number cannot be null")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number should be 10 digits")
    private long accountNumber;

    @NotEmpty(message = "Account type cannot be null")
    private String accountType;

    @NotEmpty(message = "Address cannot be null")
    private String branchAddress;
}
