package javaproblems;

public class TimeConversion {
    static String timeConversion(String s) {
        String newTime = null;
        if (s.contains("PM")) {
            if (Integer.parseInt(s.substring(0, 2)) != 12) {
                int s1 = Integer.parseInt(s.substring(0, 2));
                int sum = s1 + 12;
                newTime = String.valueOf(sum).concat(s.substring(2, 8));
                System.out.println(newTime);
            } else {
                newTime = s.substring(0, 8);
                System.out.println(newTime);
            }
        } else if (s.contains("AM")) {
            if (Integer.parseInt(s.substring(0, 2)) != 12) {
                newTime = s.substring(0, 8);
                System.out.println(newTime);
            } else {
                newTime = "00".concat(s.substring(2, 8));
                System.out.println(newTime);

            }
        }
        return newTime;
    }


    public static void main(String[] args) {
        String s = "12:05:45AM";
        timeConversion(s);




    }
}

