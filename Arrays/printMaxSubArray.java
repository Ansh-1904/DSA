class printMaxSubArray {

    public static void printMaxSubarray(int nums[])
    {
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int currSum=0;
                for(int k=i;k<=j;k++)
                {
                    currSum=currSum+nums[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum)
                {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum="+maxSum);
    }

    public static void main(String args[])
    {
        int nums[]={2,4,6,8,10};
        printMaxSubarray(nums);
    }
}