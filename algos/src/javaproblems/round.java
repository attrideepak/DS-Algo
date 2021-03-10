package javaproblems;

import java.text.DecimalFormat;

public class round {

	public static void main(String[] args) {
		double value = roundNumber(1.2367,3);
		System.out.println("*************** " + value);
		
		DecimalFormat df = new DecimalFormat("#.###");
		String value1 = df.format(12.2364);
		System.out.println("*************** " + value1);
		
	    System.out.println("******************** ceil test 1 " +Math.ceil(123.56));
	    System.out.println("******************** ceil test 2 " +Math.ceil(123.46));
	    System.out.println("******************** ceil test 3 " +Math.ceil(123.65));
	    System.out.println("******************** floor test 1 " +Math.floor(123.56));
	    System.out.println("******************** floor test 2 " +Math.floor(123.44));
	    System.out.println("******************** floor test 3 " +Math.floor(123.65));
	    System.out.println("******************** int test 1 " +(int)123.56);
	    System.out.println("******************** int test 2 " +(int)123.44);
	    System.out.println("******************** int test 3 " +(int)123.65);
	    System.out.println("******************** round test 1 " +Math.round(123.56));
	    System.out.println("******************** round test 2 " +Math.round(123.44));
	    System.out.println("******************** round test 3 " +Math.round(123.65));
	   
	    
	    

	}
	private static double roundNumber (double value, int precision) {
	    int scale = (int) Math.pow(10, precision);
	    return (double) Math.round(value * scale) / scale;
	}

}
