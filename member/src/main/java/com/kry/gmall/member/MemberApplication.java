package com.kry.gmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kerryhe
 */
@tk.mybatis.spring.annotation.MapperScan(basePackages = {"com.kry.gmall.member.dao"})
@SpringBootApplication
public class MemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }

}
