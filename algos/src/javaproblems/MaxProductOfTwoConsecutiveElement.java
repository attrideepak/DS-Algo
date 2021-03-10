package javaproblems;


public class MaxProductOfTwoConsecutiveElement {
	
	public int maxProduct(int[] array) {
		int max = 0;
		int product = 0;
		for(int i = 0; i<array.length-1;i++) {
			product = array[i]*array[i+1];
			if(product>max) {
			max = product;
			}	
			
		}
		System.out.println("Max Product is: "+max);
		return max;			
	}
    public static void main(String[] args) {
	int array[] = {1,20,1,3,25,2,4,8,9,10,2};
	MaxProductOfTwoConsecutiveElement maxProductofTwo = new MaxProductOfTwoConsecutiveElement();
	maxProductofTwo.maxProduct(array);
}
}