package com.vip.webordertwo;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.vip.webordertwo.mapper")
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class WebOrderTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebOrderTwoApplication.class, args);
    }

}
