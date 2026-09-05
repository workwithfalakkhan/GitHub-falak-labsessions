package com.practice.scalerlabsession.designPatterns.creational.builder;

public class Client {

    public static void main(String[] args) {
        StudentBilder studentBilder = new StudentBilder();
        studentBilder.setAddress("123 Main St");
        studentBilder.setAge(18);
        studentBilder.setGender("Male");
       // studentBilder.setName("John");
        studentBilder.setPhoneNumber("1234567890");
        studentBilder.setEmail("john@example.com");

        Student s = new Student(studentBilder);
    }
}
