package com.eicke.dubbo.demo.domain;

import java.io.Serializable;

/**
 * Created by liujinyan on 2017/2/8.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 3805445480291434525L;
    private String id;
    private String name;
    private Integer age;
    private String password;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
