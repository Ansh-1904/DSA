class FindMinInRotatingSortedArray {
    
    public int search(int[] nums) {
        int low=0, high=nums.length-1;
        int minimum=nums[0];

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]<minimum) 
            {
                minimum=nums[mid];

            if(nums[low]<=nums[mid])
            {
                if(nums[low]<=minimum && minimum<=nums[mid])
                {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<=minimum && minimum<=nums[high])
                {
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int nums[]={7,8,9,1,2,3,4,5,6};
        RotatingSortedArray rotatingSortedArray=new RotatingSortedArray();
        int ans=rotatingSortedArray.search(nums,1);
        System.out.println(ans);
    }

}