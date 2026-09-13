package com.practice.scalerlabsession.designPatterns.creational.prototype;

public class Client {

    public static void main(String[] args) {
        VMInstance originalInstance = new VMInstance();
        GpuVmInstance gpuVmInstance = new GpuVmInstance();


        VMInstance copyVmInstance = originalInstance.clone();
        GpuVmInstance copyGpuVmInstance = gpuVmInstance.clone();
    }

}
