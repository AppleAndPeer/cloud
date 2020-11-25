package com.me.test.basic;

import lombok.Data;

@Data
public class MessagePackage<T> {
    public MessagePackage() {
    }

    public MessagePackage(T dana) {
        this.dana = dana;
    }

    public MessagePackage(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code = 0;
    private String msg = "success";
    private T dana;
}
