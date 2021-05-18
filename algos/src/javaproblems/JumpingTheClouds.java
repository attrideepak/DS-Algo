package javaproblems;
//There is an array of clouds,c and an energy level e = 100. The character starts from c[0] and uses 1 unit of energy to make a jump of size k  to cloud c[(i+k)%n] .
// If it lands on a thundercloud,c[i]=1 , its energy (e) decreases by 2 additional units. The game ends when the character lands back on cloud 0.
//Given the values of n,k , and the configuration of the clouds as an array c , determine the final value of e after the game ends.

public class JumpingTheClouds {
    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int next ;
        int i = 0;
        while ( (i + k) % c.length >=0 ) {
            next = (i + k) % c.length;
            if (c[next] == 0) {
                e = e - 1;
            } else {
                e = e - 3;
            }
            if (next == 0) {
                break;
            }
            i = next;
        }
        System.out.println(e);
        return e;
    }

    public static void main(String[] args) {
        int c[] = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        int k = 3;
        jumpingOnClouds(c,k);
    }

}
//i+k%n
//3-> 6 -> 9 -> 2 -> 5 -> 8 -> 1 -> 4 -> 7 -> 0
//99 -> 98 ->97 -> 94 ->91 -> 90 -> 87 -> 84 -> 83 -> 80
//output = 80