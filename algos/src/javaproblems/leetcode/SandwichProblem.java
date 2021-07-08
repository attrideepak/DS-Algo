package javaproblems.leetcode;
//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch
public class SandwichProblem {
    public static int countStudents(int[] students, int[] sandwiches) {
        int zeroCount = 0, oneCount = 0;
        //count one and zeror in students
        for(int i : students) {
            if(i == 0) zeroCount ++;
            else oneCount ++;
        }
        for(int s: sandwiches) {
            //if s == 0 let it be eaten and reduce zero count by 1
            //if zero count becomes zero and still zero is left in sandwich it means all remaining one count will starve
            if(s == 0) {
                if(zeroCount == 0) return oneCount;
                zeroCount --;
            }
            //if s == 1 let it be eaten and reduce one count by 1
            //if one count becomes zero and still one is left in sandwich it means all remaining zero count will starve
            else {
                if(oneCount == 0) return zeroCount;
                oneCount--;
            }
        }
        return 0;
    }
}
