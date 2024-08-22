//sort array of 0's, 1's & 2's
class dutchFlag {
    public static void sortZeroOneTwo(int[] nums) {
        //Arrays.sort(nums);
        //Time Complexity: O(NxlogN), where N is the size of the array. As the optimal sorting take O(N * logN) time.
        //Space Complexity: O(1) no extra space is used to solve the problem.


        //optimal approach
        // Time Complexity: O(N), where N is the size of the array, as there is single traversal of the array.
        // Space Complexity: O(1), no extra space is used.
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==2)
            {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            else{
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        // int[] nums = {0, 2, 1, 2, 0, 1};
        int[] nums = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
        
        sortZeroOneTwo(nums);
        
        // Print the array elements after sorting
        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}