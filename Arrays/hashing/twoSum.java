import java.util.*;
class twoSum {

    public static int[] twoSum(int nums[], int target)
    {

        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int moreNeeded=target-num;
            if(map.containsKey(moreNeeded))
            {
                return new int[]{map.get(moreNeeded),i};
            }
            map.put(num,i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;
        
        // Call the twoSum method from Solution class
        int[] ans = twoSum(nums, target);

        // Print the result
        System.out.println("Indices of the two numbers that sum up to " + target + " are: [" + ans[0] + ", " + ans[1] + "]");
    }
}