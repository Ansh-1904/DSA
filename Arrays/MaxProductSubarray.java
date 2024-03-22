class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(prefix==0) {
                prefix=1;

            }
            if(suffix==0)
            {
                suffix=1;
            }

            prefix=prefix*nums[i];
            suffix=suffix*nums[n-i-1];

            ans=Math.max(ans,Math.max(prefix,suffix));
        }
        return ans;
    }

    public static void main(String[] args) {
        MaxProductSubarray solution=new MaxProductSubarray();
        // int nums[]={-2,3,4,-1,0,-2,3,1,4,0,4,6,-1,4};
        int nums[]={2,3,-2,4};
        int ans=solution.maxProduct(nums);
        System.out.println(ans);
        

    }
}