package com.test;

public class User {
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String say(){
        return "我是"+id+"号 我的名字是"+name+" 我今年"+age+"了";
    }

}
