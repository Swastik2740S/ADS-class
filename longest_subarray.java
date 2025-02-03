package Arrays;

public class longest_subarray {
    public static void main(String[] args) {
        
    }

    public static void subarray(int[] arr,int target)
    {
        int n = arr.length;
      int index = 0;
      int sum = 0;
      int count=1;
      for(int i=1;i<n;i++)
      {
        sum = sum + arr[index] + arr[i];
        count++;

        if(sum==target)
        {
            break;
        }
      }
    }
}
