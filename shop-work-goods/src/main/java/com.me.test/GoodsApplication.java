package com.me.test;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@MapperScan("com.me.test.repository")
@SpringBootApplication
public class GoodsApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GoodsApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);

    }
}