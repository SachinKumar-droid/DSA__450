//Question: Given an array of integers, return indices of the two numbers such that they add up to a specific target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.
import java.util.Scanner;
public class Two_sum_array {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<5;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter Target : ");
        int target=obj.nextInt();
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("Indices : "+i+" "+j);
                }
            }
        }
        obj.close();

    }
}
