package com.codingtest.nss.sender.dto;

public record EmailSendRequest(String emailAddress, String title, String contents) {
}
