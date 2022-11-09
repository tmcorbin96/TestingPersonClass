package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private String address;
    private boolean disabled;
    private double weight;
    private char sex;

    public Person() {
    }

    public Person(int age) {
    }

    public Person(String name) {
    }

    public Person(String name, int age) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName() {
       return name;
    }

    public Integer getAge() {
        return age;
    }
    public String currentAddress(String expected) {
        return address;
    }
}
