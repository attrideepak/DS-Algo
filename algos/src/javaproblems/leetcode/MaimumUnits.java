package javaproblems.leetcode;

import java.util.Arrays;

public class MaimumUnits {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        //Sorting(java-8 lambda) the array in such a way that the boxes which contain more units will appear first.
        Arrays.sort(boxTypes, (x, y) -> y[1]-x[1]);

        //count to store the total
        int count=0;

        //length to iterate array
        int size = boxTypes.length;

        for(int i=0; i<size; i++)
        {
            //if truck size is more than the boxes available of type i, we can include all the boxes
            if(truckSize>boxTypes[i][0]){
                count += boxTypes[i][0]*boxTypes[i][1];
                //reduce the size of the truck by the number of boxes added
                truckSize -= boxTypes[i][0];
            }
            //here the truck size is less than the boxes available of type i, so we will include only the boxes which truck can accomodate.
            else{
                count += truckSize*boxTypes[i][1];
                break;
            }
        }
        System.out.println(count);
        return count;
    }
}
