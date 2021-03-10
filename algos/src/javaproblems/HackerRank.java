package javaproblems;

public class HackerRank {
	static int reverse(int i) {
		 int rev = 0;
		 int n = i;
		 while (n>0) {
			rev = (rev*10)+n%10;
			n = n/10;
		} 
		 return rev;
		 
		}
	
	
	static int beautifulDays(int i, int j, int k) {
		int count = 0;
		int a =0;
		while(i<=j) {
			a = Math.abs((i -reverse(i)));
			if(a%k == 0) {
				count++;
			}
		}
		return count;
		
    }
				 
 public static void main(String[] args) {
		//System.out.println(reverse(13));
	 System.out.println(beautifulDays(20, 23, 6));
	 }
 }


