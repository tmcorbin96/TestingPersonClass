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
        name = "";
        age = 0;
        address = "";
        disabled =false;
        weight = 0;
        sex = ' ';
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name=name;
    }

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
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
    public void setWeight(double weight) {
        this.weight=weight;
    }

    public void setDisability(boolean disabled) {
        this.disabled=disabled;
    }

    public void setSex(char sex) {
        this.sex=sex;
    }

    public String getName() {
       return name;
    }

    public Integer getAge() {
        return age;
    }
    public String currentAddress() {
        return address;
    }

    public Double getWeight() {
        return weight;
    }
    public Boolean getDisability() {
        return disabled;
    }

    public Character getSex() {
        return sex;
    }


}
