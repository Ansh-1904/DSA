import java.util.*;

public class countFreq {
    public static int[] countFrequency(int n, int x, int[] nums) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map1.containsKey(nums[i])) {
                map1.put(nums[i], map1.get(nums[i]) + 1);
            } else {
                map1.put(nums[i], 1);
            }
        }
        int[] output = new int[n]; // Create an array to store the frequencies
        
        for (int i = 1; i <= n; i++) {
            output[i - 1] = map1.getOrDefault(i, 0);
        }
        return output;
    }

    public static void main(String args[]) {
        int nums[] = {1, 3, 4, 3, 4, 1};
        int output[] = countFrequency(6, 4, nums);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}

