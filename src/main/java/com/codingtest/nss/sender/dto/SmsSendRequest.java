package com.codingtest.nss.sender.dto;

public record SmsSendRequest(String phoneNumber, String title, String contents) {
}
