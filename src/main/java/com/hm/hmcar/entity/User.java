package com.hm.hmcar.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String phone;
    private String password;
    private Integer flag;
}
