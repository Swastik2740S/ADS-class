package Arrays;
import java.util.*;

public class remove_duplicate {

    public static void main(String[] args) {
        int[] arr={1,2,2,2,3};
        System.out.println(Arrays.toString(remove(arr)));
    }

    public static int[] remove(int[] arr)
    {
        int[] temp = new int[arr.length];
        int j=0;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[arr.length-1];

        return Arrays.copyOf(temp,j);
    }
}

