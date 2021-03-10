package javaproblems;



/**
 * Created by Aeepakattri on 16/07/18.
 */
public class MobilePhone {
    //1.Define variables
    private String camera;
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public MobilePhone(Builder builder) {
        this.camera = builder.camera;
        this.os = builder.os;
        this.battery= builder.battery;
        this.processor=builder.processor;
        this.ram=builder.ram;
        this.screenSize=builder.screenSize;
    }

    //2. Create inner static class builder
    //3. Create Builder Methods : i. Create Setters > ii. Replace void with Builder object > iii. return this
    //4. Each builder method will return a object of Builder class so that prameters can be set at run time

    public static class Builder{
        private String camera;
        private String os;
        private int ram;
        private String processor;
        private double screenSize;
        private int battery;

        public Builder Camera(String camera) {
            this.camera = camera;
            return this;
        }

        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setScreenSize(double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Builder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        //5. Define a method to create an object of these  variables
        //6. rerturn this and create a contructor

        public MobilePhone build(){
            return new MobilePhone(this);
        }


    }

    @Override
    public String toString() {
        return "MobilePhone{" + "camera='" + camera + '\'' + ", os='" + os + '\'' + ", ram=" + ram + ", processor='" + processor + '\'' + ", screenSize=" + screenSize + ", battery=" + battery + '}';
    }
}
