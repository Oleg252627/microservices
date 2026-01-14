package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ResponseDto implements Serializable {

    private String statusCode;
    private String statusMsg;
}
