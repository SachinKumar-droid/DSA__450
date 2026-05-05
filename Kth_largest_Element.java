// find the Kth largest element in this given array you can also take elements of array to user 


import java.util.Scanner;
import java.util.Arrays;

public class Kth_largest_Element { 
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[6];
        int k = 0;

        System.out.println("Enter elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("Enter value of 'K' to find Kth Largest Element");
        k = obj.nextInt();

        // Siort array in descending order
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
        System.out.println("Kth Largest Element is: " + arr[k-1]);

        obj.close();
    }
}

