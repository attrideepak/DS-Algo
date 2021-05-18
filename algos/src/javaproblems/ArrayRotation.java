package javaproblems;


/**
 * Created by DeepakAttri on 29/07/18.
 */
public class ArrayRotation {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d =2;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[(i+d)%n]+" ");
        }
    }
}
/*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int array[] = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            System.out.print(array[(i+d)%n] + " ");
        }
}*/
