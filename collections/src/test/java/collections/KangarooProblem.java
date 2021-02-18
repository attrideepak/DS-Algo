package com.mylearnings.java.collections;

public class KangarooProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kangaroo(0,3,4,2);
	}
	

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2) {
	        if(x2>x1 && v2>v1)	
	        return "NO";
	        while(x1<=x2){
	            x1=x1+v1;
	            x2=x2+v2;
	            if(x1==x2)
	            return "YES";
	        }
	         return "NO";
	    }

}
