import java.util.*;

public class paintersPartition 
{

    public static int countPartitions(ArrayList<Integer> arr, int maxSum) {
        int partitions = 1;
        int subarraySum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (subarraySum + arr.get(i) <= maxSum) {
                subarraySum += arr.get(i);
            } else {
                partitions++;
                subarraySum = arr.get(i);
            }
        }
        return partitions;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < boards.size(); i++) {
            maxi = Math.max(maxi, boards.get(i));
            sum += boards.get(i);
        }
        int low = maxi;
        int high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (countPartitions(boards, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        ArrayList<Integer> boards = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int k = 2;
        int ans = findLargestMinDistance(boards, k);
        System.out.println("The answer is: " + ans);
    }
}
