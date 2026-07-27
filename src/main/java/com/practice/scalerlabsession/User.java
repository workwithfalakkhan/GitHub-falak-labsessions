package com.practice.scalerlabsession;

public class User {

    private static int count = 0;
    private String userId;
    private String name;

    public User(){
        this.userId = generateUniqueId();
    }

    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;

    }

    public User(User user){
        this.userId = user.userId;
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    private String contactInfo;

    public  String generateUniqueId(){
        count++;
        return "#####"+count;

    }

}
