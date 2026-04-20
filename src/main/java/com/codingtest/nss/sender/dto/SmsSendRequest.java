package com.codingtest.nss.sender.dto;

public record SmsSendRequest(String id, String phoneNumber, String title, String contents) {
}
