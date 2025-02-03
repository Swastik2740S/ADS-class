package Arrays;

public class pivot {
    public static void main(String[] args) {
        int[] arr = {1,5,6,4,6,6};
        System.out.println(pivot_point(arr));
    }

    public static int pivot_point(int[] arr)
    {
        int totalsum = 0;
        int leftsum  =0;
        int rightsum  =0;
       
        for(int i=0;i<arr.length;i++)
        {
            totalsum += arr[i];
        }

        for(int i=0;i<arr.length;i++)
        { 
            rightsum  = totalsum-leftsum-arr[i];
            if(leftsum==rightsum)
            {
               return i;
            }
            leftsum += arr[i];


        }
        return -1;
        
    }
}
