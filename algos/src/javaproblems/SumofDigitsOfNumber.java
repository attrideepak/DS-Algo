package javaproblems;

public class SumofDigitsOfNumber {
	//Finding sum of digits of a number until sum becomes single digit
	public int digitSum(int n) {
		int sum = 0;
        while (n > 0)
        {
            sum = sum + (n % 10);
            n = n/10;
        }
        if (sum > 9)
        {
            sum = digitSum(sum);
        }
        System.out.println(sum);
        return sum;	
	}
	
	public static void main(String[] args) {
		SumofDigitsOfNumber digitsSum = new SumofDigitsOfNumber();
		digitsSum.digitSum(19);
	}
	
}

