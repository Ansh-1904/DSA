class findSmallestDivisorWithinLimit {
    public static boolean result(int[]nums, int divisor, int limit)
    {
        int answer=0;
        for(int i=0;i<nums.length;i++)
        {
            answer+=Math.ceil((double)(nums[i])/(double)(divisor));
        }
        if(answer<=limit) return true;
        else return false;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        if(nums.length > threshold) return -1;
        int low=1;
        int ans=Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int high=maxi;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(result(nums,mid,threshold)){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // int limit = 8;
        int[] arr = {8, 4, 2, 3};
        int limit = 10;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }


}