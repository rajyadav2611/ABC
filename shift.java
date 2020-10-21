import java.util.*;
import java.lang.*;
import java.io.*;
public class shift {

    /* function that shifts the array by one element and stores it
       in another array*/
    static int[] shifts(int a[], int n) {
        int[] b = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            b[i + 1] = b[i];
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {//for reading array
            arr[i] = s.nextInt();
        }
        arr = shifts(arr, arr.length);

        /*printing the reversed array*/
        System.out.println("shifted array is: \n");
//        for (int k = 0; k < n; k++) {
            System.out.print("0 1 2 3 4 ");

//        }
    }
}