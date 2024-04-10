package com.codingtest.nss.sender;

import lombok.Getter;

import java.util.Random;

@Getter
public enum ResultType {
    SUCCESS( "SUCCESS" ),
    FAIL( "FAIL" ),
    EXCEPTION( "EXCEPTION" ),
    ;

    private String result;

    ResultType(final String result) {
        this.result = result;
    }

    public static ResultType getRandomResultType() {
        final Random random = new Random();
        final ResultType[] values = ResultType.values();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex];
    }
}
