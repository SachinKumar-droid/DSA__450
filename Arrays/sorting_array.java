/* QUESTION : there is an integer array called arr[] this array has has only
 three digits but multiple times in unshorted way= 0,1,and2 denoting red,white,and blue,
MAIN : you just need short the array in accending order;
Example/-

INPUT==arr[1,0,2,2,0,1,2,1,1]
OUTPUT=arr[0,0,1,1,1,1,2,2,2]
hope you understand!
 */
public class sorting_array {
    public static void main(String[] args) {    
        int[] arr=new int[]{0,1,2,0,2,1,2,1,0,2,0,1};
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
//hey there is a function in java called Arrays.short(array_name);
//this will automatically short your array no need to do manually like me cool
//IMPORTANT == **this function is not required in this question and dont use it,
//use your brain, this function is against to this question,hope you understand!**//
