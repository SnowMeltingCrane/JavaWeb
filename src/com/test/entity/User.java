package com.test.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User {
    private int id;
    private String name;
    private int age;
    private UserDetail detail;
    private List<Book> books;
    private Group group;
}


