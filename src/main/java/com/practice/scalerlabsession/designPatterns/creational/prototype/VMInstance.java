package com.practice.scalerlabsession.designPatterns.creational.prototype;

public class VMInstance implements Prototype<VMInstance>{

    private String os;
    private String memory;
    private String cpu;
    private String storage;
    private String network;

    protected VMInstance(VMInstance other){
        this.os = other.os;
        this.memory = other.memory;
        this.cpu = other.cpu;
        this.storage = other.storage;
        this.network = other.network;
    }

    public VMInstance(){}

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public VMInstance clone() {
        return new VMInstance(this);
    }
}
