package Arrays;

import java.util.Arrays;

public class defuse_bomb {
    public static void main(String[] args) {
        //problem number 1652
        int[] arr = {2,4,9,3};
        System.out.println(Arrays.toString(decrypt(arr, -2)));
    }

    public static int[] decrypt(int[] code,int k)
    {
        int n = code.length;
        int[] result = new int[n];
        if(k==0)
        {
            return result;
        }

        int step;
        if(k>0)
        {
            step = 1;
        }
        else{
            step = -1;
            k = -k;
        }

        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=1;j<=k;j++)
            {
                int index = (i+(j*step)+n)%n;
                sum += code[index];
            }
            result[i] = sum;
        }

        return result;
    }
}
