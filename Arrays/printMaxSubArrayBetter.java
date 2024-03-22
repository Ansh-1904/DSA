//o(n2) better than previous method
class printMaxSubArrayBetter {

    public static void printMaxSubarray(int nums[])
    {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        //calculate prefix array
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                currSum = i == 0? prefix[j] : prefix[j]-prefix[i-1];
                if(currSum>maxSum)
                {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum="+maxSum); //6,-1,3 is the subarray whose sum is max
    }

    public static void main(String args[])
    {
        int nums[]={1,-2,6,-1,3};
        printMaxSubarray(nums);
    }
}




