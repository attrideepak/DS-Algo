package javaproblems;

//An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers 
//appear before all positive numbers. 

public class ArrangePositiveNegative {

	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4, -5, 6, -7, 8, 9 }; 
		rearrange(arr);
		//rearrangePositiveNegative(arr);
		 for (int i = 0; i < arr.length; i++) 
	            System.out.print(arr[i] + " ");

	}
		
	static void rearrange(int a[]) {
		int j=0;
		int temp;
	
		for(int i = 0; i<a.length; i++) {
			if(a[i]<0) {
				if (i != j) {
				temp = a[i]; 
                a[i] = a[j]; 
                a[j] = temp; 
				}
			j++;
		}
	}

	}
	
	static void rearrangePositiveNegative(int arr[]) {
		int l = 0;
		int r = arr.length-1;
		while (l < r) { 
			  
		        // find element that is negative 
		        while (arr[l] < 0) 
		            l++; 
		  
		        // find element that is positive 
		        while (arr[r] > 0) 
		            r--; 
		  
		        // swap elements. 
		        if (l < r) { 
		        	int temp;
		        	temp = arr[l]; 
	                arr[l] = arr[r]; 
	                arr[r] = temp;  
		            l++; 
		            r--; 
		        } 
		    } 
}
}
	
			
/*a[0] = -1 , swap   =   { -1, 2, -3, 4, 5, 6, -7, 8, 9 };  , j = 1
 * a[1] = 2 , no swap ={ -1, 2, -3, 4, 5, 6, -7, 8, 9 };  
 * a[2] = -3 , swap with a[j] = a[1], { -1, -3, 2, 4, 5, 6, -7, 8, 9 };  , j =2
 * a[3] = 2,  no swap
 * a[4] = 5, no swap
 * a[5] = 6, no swap
 * a[6] = -7 , swap with a[2], { -1, -3, -7, 4, 5, 6, 2, 8, 9 };
 *
 * */
