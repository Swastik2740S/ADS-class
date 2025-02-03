package Arrays;

public class largest {
    public static void main(String[] args) {
        int[] arr = {2,6,97,38,34};
        System.out.println(large(arr));
    }

    public static int large(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        return max;
    }
}
