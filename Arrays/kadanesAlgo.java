// Used to find the max subarray sum 
// o(n)

class kadanesAlgo {

    public static void kadanesAlgo(int nums[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            currSum=currSum+nums[i];
            if(currSum<0)
            {
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        if(maxSum==0)
        {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>max)
                {
                    max=nums[i];
                }
            }
            System.out.println("Max Sub Array Sum = "+max);
        }
        else{
            System.out.println("Max Sub Array Sum = "+maxSum);
            System.out.println("Current Sum = "+currSum); 
        }
        
    }

    public static void main(String args[])
    {
        // int nums[]={-1,-2,-3,-4};
        int nums[]={-2,-3,4,-1,-2,1,5,4};
        //int nums[]={-5,-1,-2,-3,-4};
        kadanesAlgo(nums);
    }
}


// Runs for all test cases
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++)
//         {
//             currSum+=nums[i];
//             if(currSum<0)
//             {
//                 currSum=0;
//             }
//             else{
//                 maxSum=Math.max(currSum,maxSum);
//             }
//         }
//         if(maxSum==0 || maxSum==Integer.MIN_VALUE)
//         {
//             int max=Integer.MIN_VALUE;
//             for(int i=0;i<nums.length;i++)
//             {
//                 if(nums[i]>max)
//                 {
//                     max=nums[i];
//                 }
//             }
//             return max;
//         }
//         return maxSum;
        
        
//     }
// }