package Arrays;

public class second_largest_smallest {
    public static void main(String[] args) {
        int[] arr = {23,45,34,56,67,57,89,9};
        System.out.print(second_largest(arr)+" ");
        System.out.println(second_smallest(arr));
    }

    public static int second_largest(int[] arr)
    {

        if(arr.length<2)
        {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                second_max = max;
                max = arr[i];
            }
            else if(arr[i]>second_max && arr[i]!=max)
            {
                second_max = arr[i];
            }
        }
        return second_max;
    }

    public static int second_smallest(int[] arr)
    {
        if(arr.length<2)
        {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
               second_min = min;
               min = arr[i];
            }

            else if(arr[i]<second_min && arr[i]!=min)
            {
                second_min = arr[i];
            }
        }

        return second_min;
    }
}
