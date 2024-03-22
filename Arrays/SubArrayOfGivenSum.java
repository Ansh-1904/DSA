import java.util.ArrayList;

public class SubArrayOfGivenSum {
    // Function to find a continuous sub-array which adds up to a given number.
    public static ArrayList<Integer> subarraySum(int arr[], int n, int s) {
        ArrayList<Integer> ansFinal = new ArrayList<>();
        int ans = 0;
        int start = 0;
        int end = 0;

        while (end < n) {
            ans += arr[end];
            
            while (ans > s && start <= end) {
                ans -= arr[start];
                start++;
            }

            if (ans == s) {
                ansFinal.add(start);
                ansFinal.add(end);
                break; // Break when a subarray with the given sum is found
            }

            end++;
        }
        return ansFinal;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        ArrayList<Integer> ansFinal = subarraySum(arr, arr.length, 12);

        if (!ansFinal.isEmpty()) {
            for (int i = 0; i < ansFinal.size(); i++) {
                System.out.print(ansFinal.get(i) + " ");
            }
        } else {
            System.out.println("No subarray found with the given sum.");
        }
    }
}
