package com.practice.scalerlabsession.designPatterns.creational.builder;

public class StudentBilder {

    String name;

    public String getAddress() {
        return address;
    }

    public StudentBilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentBilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public StudentBilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StudentBilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public StudentBilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    int age;
    String address;
    String phoneNumber;
    String email;
    String gender;


}
