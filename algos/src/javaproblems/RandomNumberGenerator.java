package javaproblems;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		System.out.println(generateRandomNumber(1, 58));

	}
	
	static int generateRandomNumber(int min, int max) {
		int x = (int) ((Math.random()*((max-min)+1))+min);
		return x;
	}

}
