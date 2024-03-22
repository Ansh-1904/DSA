class FindMinInRotatingSortedArray {
    
    public int search(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the minimum element
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
    
    

    public static void main(String args[])
    {
        int nums[]={7,8,9,1,2,3,4,5,6};
        FindMinInRotatingSortedArray rotatingSortedArray=new FindMinInRotatingSortedArray();
        int ans=rotatingSortedArray.search(nums);
        System.out.println(ans);
    }
    
}