//give start and end index of max Sum
class followUpQKadanes {
    public int[] maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int startIndex = 0;
        int tempStartIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            // Update the maxSum and indices if we find a new maximum
            if (currSum > maxSum) {
                maxSum = currSum;
                startIndex = tempStartIndex;
                endIndex = i;
            }

            // Reset current sum and update the temporary start index if currSum is negative
            if (currSum < 0) {
                currSum = 0;
                tempStartIndex = i + 1;
            }
        }

        // Handle the case where all numbers might be negative
        if (maxSum == 0) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    startIndex = i;
                    endIndex = i;
                }
            }
            maxSum = max;
        }

        // Return an array with maxSum, startIndex, and endIndex
        return new int[]{maxSum, startIndex, endIndex};
    }

    public static void main(String[] args) {
        followUpQKadanes sol = new followUpQKadanes();
        // int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        int[] result = sol.maxSubArray(nums);
        System.out.println("Max Subarray Sum: " + result[0]);
        System.out.println("Start Index: " + result[1]);
        System.out.println("End Index: " + result[2]);
    }
}
