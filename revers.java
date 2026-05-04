//this program is for revers array
import java.util.Scanner;
class revers{
    public static void main(String[] args) {
        
    Scanner obj=new Scanner(System.in);
    char[] arr =new char[6];

    System.out.println("Enter array Elements : ");
    for(int i=0;i<=5;i++)
    {
        arr[i]=obj.next().charAt(0);
    }
    char temp;
        for(int i=0;i<arr.length/2;i++)
        {
         temp=arr[i];
         arr[i]=arr[arr.length-1-i];
         arr[arr.length-1-i]=temp;   
        }
        for(int i=0;i<=5;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
        obj.close();
    }
}



// import java.util.Scanner;

// class ReverseArray {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);

//         char[] arr = new char[6];

//         System.out.println("Enter 6 array elements (characters): ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = obj.next().charAt(0); // take first char of input
//         }

//         // Reverse the array
//         for (int i = 0; i < arr.length / 2; i++) {
//             char temp = arr[i];
//             arr[i] = arr[arr.length - 1 - i];
//             arr[arr.length - 1 - i] = temp;
//         }

//         System.out.println("Reversed array:");
//         for (char c : arr) {
//             System.out.println(c);
//         }

//         obj.close();
//     }
// }
