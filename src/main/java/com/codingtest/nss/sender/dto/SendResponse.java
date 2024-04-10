package com.codingtest.nss.sender.dto;

import lombok.Builder;

@Builder
public record SendResponse(String resultCode) {

    public static final String SUCCESS = "SUCCESS";
    public static final String FAIL = "FAIL";
}
