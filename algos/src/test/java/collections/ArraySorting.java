package com.mylearnings.java.collections;

public class ArraySorting {
	public static void main(String[] args) {
//		int array[]= {125,120,130,110,1,7,100,95,90};
//		System.out.println("Using selection sort: ");
//		selectionSort(array);
//		System.out.println("Using bubble sort: ");
//		bubbleSort(array);
//		System.out.println("Using insertion sort: ");
//		insertionSort(array);
		String[] words = { "Ruby", "C","CA","CC", "Python", "Java" };
		stringSort(words);

	}
	/*  In selection sort algorithm, we search for the lowest element and 
	 * arrange it to the proper location. 
	 * We swap the current element with the next lowest number.*/
		static void selectionSort(int[] arr) {
			
		for(int i = 0; i<arr.length-1;i++) {
			int index =i;
			for(int j =i+1; j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index = j; //finding the smallest index
				}				
			}
			//Swap the found minimum element with the first element
			int temp = arr[index];   
            arr[index] = arr[i];  
            arr[i] = temp;
						}	
		for(int a:arr) 
		{	
			System.out.print(a+ " ");
		}
		System.out.println();
		
	}
		//Bubble Sort is the simplest sorting algorithm that works 
		//by repeatedly swapping the adjacent elements if they are in wrong order.
	static void bubbleSort(int[] arr) {
		boolean swapped;  //using swapped for optimization, inner loop will continue only if swapping is possible
		for(int i=0;i<arr.length-1;i++) {
			swapped =false;
			for(int j =0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];   
		            arr[j+1] = arr[j];  
		            arr[j] = temp;
		            swapped = true;
				}
				// IF no two elements were  
	            // swapped by inner loop, then break 
				 if (swapped == false) 
		                break;
			}
		}
		for(int a:arr) 
		{  
			System.out.print(a+ " ");
		}
		System.out.println();
		
	}
	static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length-1;i++) {
			int key = arr[i]; 
            int j =i; 
            /* Move elements of arr[0..i-1], that are 
            greater than key, to one position ahead 
            of their current position */
            while (j>0 && arr[j-1] > key) 
            { 
                arr[j] = arr[j-1]; 
                j = j-1; 
            } 
            arr[j] = key; 
        } 
		for(int a:arr) 
		{  
			System.out.print(a+ " ");
		}
			
		}
	//Quick Sort
	//Merge Sort
	//Heap Sort
	static void stringSort(String[] arr) {
		for(int i = 0; i<arr.length-1;i++) {
			int index =i;
			for(int j =i+1; j<arr.length;j++) {
				if(arr[j].compareTo(arr[index])<0) {
					index = j; //finding the smallest index
				}				
			}
			//Swap the found minimum element with the first element
			String temp = arr[index];   
            arr[index] = arr[i];  
            arr[i] = temp;           
		}
            for(String a:arr) {
    			System.out.println(a);
	}
	}
	}


