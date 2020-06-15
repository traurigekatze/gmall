package com.kry.gmall.common.util.dto;

import lombok.Data;

/**
 * @author kerryhe
 * @date 2020/6/15
 */
public class PersonDto {

    private String name;

    private String sex;

    private Integer age;

    private String address;

    public PersonDto(String name, String sex, Integer age, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
