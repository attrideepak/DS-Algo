package com.mylearnings.java.collections;



//product class
public class Phone {
    private String camera;
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public Phone(String camera, String os, int ram, String processor, double screenSize, int battery) {
        this.camera = camera;
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }


    @Override
    public String toString() {
        return "Phone{" + "camera='" + camera + '\'' + ", os='" + os + '\'' + ", ram=" + ram + ", processor='" + processor + '\'' + ", screenSize=" + screenSize + ", battery=" + battery + '}';
    }
//    public Phone getPhone(){
//        return new Phone(camera, os, ram, processor, screenSize, battery);
//    }



}
