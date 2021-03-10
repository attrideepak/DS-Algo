package javaproblems;



/**
 * Created by Aeepakattri on 16/07/18.
 */
public class BuildMobilePhone {
    public static void main(String[] args) {
        MobilePhone.Builder p =new MobilePhone.Builder()
                .setBattery(2000)
                .Camera("50")
                .setProcessor("Mediatek")
                .setOs("Android")
                .setRam(4)
                .setScreenSize(6.5);

        MobilePhone mobilePhone = p.build();
        System.out.println(mobilePhone);

    }
}
