// import java.lang.reflect.Array;
// import java.util.Arrays;
// import java.util.Scanner;
// public class Min_Max_Element_Array {
//     public static void main(String[] args) {
//         Scanner obj=new Scanner(System.in);
//         int[] arr=new int[5];
//         System.out.println("Enter Aarray Elemnts : ");
//         for(int i=0;i<5;i++)
//         {
//             arr[i]=obj.nextInt();
//             // System.out.println(arr[i]);
//         }
//         Arrays.sort(arr);
//         for(int i=0;i<5;i++)
//         {
//             System.out.println(arr[i]);
//         }
//         System.out.println("Minimum Element : "+arr[0]);
//         System.out.println("Maximum Element : "+arr[arr.length-1]);
//         obj.close();
//     }
// }

import java.util.Scanner;
class Min_Max_Element_Array
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int[] arr=new int[5];
        int max=arr[0],min=arr[0];
        System.out.println("Dalo : ");
        for(int i=0;i<5;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("success");
        for(int i=0;i<5;i++)
        {
           if(arr[i]>max)
           {
            max=arr[i];
           }
           if(arr[i]<min)
           {
            min=arr[i];
           }
        }
        System.out.println("Maximum Element : "+max);
        System.out.println("Minimum Element : "+min);
        obj.close();
    }
}