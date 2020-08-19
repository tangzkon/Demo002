package com.example.demo002.pojo;

import java.io.Serializable;

public class PersonEntity implements Serializable {
    private static final long serialVersionUID = 8087556622307419936L;
    private String pname;
    private String address;
    private Integer age;
    private String sex;
    private Integer pid;

    public PersonEntity() {
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "name='" + pname + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", pid=" + pid +
                '}';
    }

    public PersonEntity(String name, String address, Integer age, String sex, Integer pid) {
        this.pname = name;
        this.address = address;
        this.age = age;
        this.sex = sex;

        this.pid = pid;


    }

    public static long getSerialVersionUID() {

        return serialVersionUID;
    }

    public String getName() {
        return pname;
    }

    public void setName(String name) {
        this.pname = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
