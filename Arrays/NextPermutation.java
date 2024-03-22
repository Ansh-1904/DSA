public class NextPermutation {
    // Method to find the next permutation of an array
    public void nextPermutation(int[] nums) {
        int index1 = -1;
        int index2 = -1;
        
        // Step 1: Find the index1, which is the first element from the right
        // such that nums[index1] < nums[index1 + 1]
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index1 = i;
                break;
            }
        }

        // If there is no such index1, it means the array is in descending order,
        // so we reverse the entire array to get the smallest permutation.
        if (index1 == -1) {
            reverse(nums, 0);
        } else {
            // Step 2: Find the index2, which is the first element from the right
            // such that nums[index2] > nums[index1]
            for (int i = nums.length - 1; i > index1; i--) {
                if (nums[i] > nums[index1]) {
                    index2 = i;
                    break;
                }
            }

            // Step 3: Swap the elements at index1 and index2
            swap(nums, index1, index2);

            // Step 4: Reverse the subarray to the right of index1
            reverse(nums, index1 + 1);
        }
    }

    // Helper method to swap two elements in an array
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper method to reverse a subarray in-place
    void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String args[]) {
        // Create an instance of NextPermutation
        NextPermutation solution = new NextPermutation();

        // Example input array
        int nums[] = {2, 1, 5, 4, 3, 0, 0};

        // Find the next permutation
        solution.nextPermutation(nums);

        // Print the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
