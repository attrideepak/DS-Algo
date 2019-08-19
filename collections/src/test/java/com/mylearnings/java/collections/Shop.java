package com.mylearnings.java.collections;
//Director Class
public class Shop {
    public static void main(String args[])
    {
        Phone p = new PhoneBuilder().setOs("Android")
                .setBattery(2000)
                .setProcessor("Mediatek")
                .setRam(4)
                .setScreenSize(6.5)
                .getPhone();
        System.out.println(p);
    }
}
