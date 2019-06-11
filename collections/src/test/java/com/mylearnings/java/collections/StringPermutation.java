package com.mylearnings.java.collections;

public class StringPermutation {
	//swap method to swap two characters
	private static void swap(char[] ch, int i, int j) {
		char temp = ch[i];  
		ch[i] = ch[j];
		ch[j] = temp;
		
	}
	//Recursive function to generate all permutations of a String
	public static void permutationusingswap(char[] ch, int currentIndex) {
		if(currentIndex==ch.length-1) {
			System.out.println(String.valueOf(ch));
		}
		else {
			for(int i = currentIndex; i<ch.length;i++) {
				swap(ch,currentIndex,i);
				permutationusingswap(ch, currentIndex+1);
				swap(ch, currentIndex, i);  //Backtracking
			}
		}
		
	}
	
	 // Recursive function to generate all permutations of a String without 
	//converting to array and using swap
    private static void permutations(String candidate, String remaining)
    {
        if (remaining.length() == 0) {
            System.out.println(candidate);
        }
        else {
        	for (int i = 0; i < remaining.length(); i++)
        {
            String newCandidate = candidate + remaining.charAt(i);
            String x = remaining.substring(0, i);
            String y = remaining.substring(i + 1);
            String newRemaining = x + y;
                                  

            permutations(newCandidate, newRemaining);
        }
    }
    }
	
	public static void main(String[] args) {
		String s = "abc";
		//permutationusingswap(s.toCharArray(), 0);
		permutations("", s);
		
	}

}	
