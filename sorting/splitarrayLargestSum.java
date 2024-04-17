class splitarrayLargestSum {

    public static int countPartitions(int[] arr, int maxSum) {
        int partitions = 1;
        int subarraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (subarraySum + arr[i] <= maxSum) {
                subarraySum += arr[i];
            } else {
                partitions++;
                subarraySum = arr[i];
            }
        }
        return partitions;
    }

    public static int largestSubarraySumMinimized(int[] arr, int k) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
            sum += arr[i];
        }
        int low = maxi;
        int high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (countPartitions(arr, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        int ans = largestSubarraySumMinimized(a, k);
        System.out.println("The answer is: " + ans);
    }
}