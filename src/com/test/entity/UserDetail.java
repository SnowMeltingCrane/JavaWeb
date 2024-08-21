package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class UserDetail {
    private int id;
    private String description;
    private Date register;
    private String avatar;
}
