package com.vip.webordertwo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.vip.webordertwo.mapper")
@SpringBootApplication
public class WebOrderTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebOrderTwoApplication.class, args);
    }

}
