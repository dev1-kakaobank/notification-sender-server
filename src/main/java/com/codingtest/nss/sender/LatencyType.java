package com.codingtest.nss.sender;

import lombok.Getter;

import java.util.Random;

@Getter
public class LatencyType {

    private final int milliSecond;

    public LatencyType() {
        final Random random = new Random();
        this.milliSecond = random.nextInt(10000) + 1;
    }
}
