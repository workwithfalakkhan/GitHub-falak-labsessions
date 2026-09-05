package com.practice.scalerlabsession.designPatterns.creational.builder;

public class Student {

    String name;
    int age;
    String address;
    String phoneNumber;
    String email;
    String gender;

    public static StudentBilder getBuilder(){
        return new StudentBilder();
    }

    public Student(StudentBilder builder){
        if(builder == null){
            throw new IllegalArgumentException("Builder cannot be null");
        }if(builder.getName() == null){
            throw new IllegalArgumentException("Name cannot be null");
        }

        if(builder.getAge()<18){
            throw new IllegalArgumentException("Age cannot be less than 18");
        }
        this.address = builder.address;
        this.age = builder.age;
        this.email = builder.email;
        this.gender = builder.gender;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
    }

}
