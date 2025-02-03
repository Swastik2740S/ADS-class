package Arrays;
public class valid_split {
    public static void main(String[] args) {
        int[] arr = {10,4,-8,7};
        System.out.println(valid(arr));
    }
    public static long valid(int[] arr) 
    {
        long count = 0;
        int total_sum=0;
        int leftsum = 0;
        int rightsum  =0;
        for(int num:arr)
        {
            total_sum = total_sum + num;
        }
        for(int i =0;i<arr.length-1;i++)
        {
              leftsum = leftsum + arr[i];
              rightsum = total_sum - leftsum;
              if(leftsum>=rightsum)
              {
                count++;
              } 
        }
        return count;
       
    }
}
