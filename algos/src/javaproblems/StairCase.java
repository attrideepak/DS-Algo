package javaproblems;

public class StairCase {


    // Complete the staircase function below.
    //static void staircase() {
    public static void main(String[] args) {
//        int i;
//        int j;
//        for(j=1; j<=6;j++) {
//            for (i = 1; i <= 6; i++) {
//                System.out.print("#");
//            }
//            switch (j) {
//                case j:
//                System.out.println("#");
//
//            }
        int num = 6;
        for(int j=0;j<num;j++){
            for(int i=0;i<num;i++){
                System.out.print(i<num-j-1?" ":"#");
            }
           System.out.println("");
        }
        }






    }



//        public static void main(String[] args) {
//
//        }
//    }

