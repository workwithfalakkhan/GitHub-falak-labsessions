package com.practice.scalerlabsession.designPatterns.creational.prototype;

public class GpuVmInstance extends VMInstance{
    private String gpu;



    private GpuVmInstance(GpuVmInstance other) {
       super(other);
        this.gpu = other.gpu;
    }

    public GpuVmInstance(){}

    @Override
    public GpuVmInstance clone()  {
        return new GpuVmInstance(this);
    }
}
