package com.eazybytes.accounts.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountsDto implements Serializable {

    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
