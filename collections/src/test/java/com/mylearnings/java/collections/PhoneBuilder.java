package com.mylearnings.java.collections;

//Builder Class
public class PhoneBuilder {

    private String camera;
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    //public void setCamera(String camera) {
    //1. Define all the variables in product class and create a constructor so that an object can be created.
    //2. Create setters for the variables
    //3. Change void to builder object so that at run time you can select the parameters to set
    //4. Add return this, which will return the phoneBuilder object
    //5. Every setter will return the phone builder object
    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;

    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    //6.Create a method of Phone class which return an object of the phone class
    public Phone getPhone(){
        return new Phone(camera, os,  ram,processor, screenSize,  battery);
    }
}

