// Question : side the all negitive numbers given in the Array;
public class Move_side_negitive_num {
    public static void main(String[] args) {
        int arr[]=new int[]{-100,-1,2,-3,4,5,-8,-6,5,-10,9,-7};
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]<0)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
