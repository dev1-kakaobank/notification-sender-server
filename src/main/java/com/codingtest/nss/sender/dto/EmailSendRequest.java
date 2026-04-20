package com.codingtest.nss.sender.dto;

public record EmailSendRequest(String id, String emailAddress, String title, String contents) {
}
