package Arrays;

import java.util.HashMap;

//kadans algorithm
public class kadans_algo {
    public static void main(String[] args) {
       int arr[] = {1,-2,3,4,-1,2,1,-5,4};
       System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums)
    {
        if(nums==null||nums.length==0)
        {
            return 0;
        }
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int num:nums)
        {
            currsum = Math.max(num, currsum+num);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }

    public static int maxSubArrayOptimized(int[] nums)
    {
        HashMap<Integer,Integer> maxlen = new HashMap<>();
        if(nums==null||nums.length==0)
        {
            return 0;
        }
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int num:nums)
        {
            currsum = Math.max(num, currsum+num);
           if(currsum<0)
           {
            currsum = 0;
           }
           maxsum = Math.max(maxsum,currsum);
        }
        return maxsum;

    }

    public static int maxlength(int[] nums, int target)
    {
        HashMap<Integer,Integer>sumMap = new HashMap<>();
        int currsum=0;
        int maxlength = 0;
        for(int i=0;i<nums.length;i++)
        { 
           currsum+=nums[i];
        
        if(currsum==target)
        {
            maxlength = i+1;
        }
        if(sumMap.containsKey(currsum-target))
        {
            maxlength = Math.max(maxlength,i-sumMap.get(currsum-target));
        }

        sumMap.putIfAbsent(currsum, i);

    }
    return maxlength;

    }
}
