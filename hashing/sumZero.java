import java.util.*;

public class sumZero {
	public static int PairSum(int[] arr, int size) {
		
        if (size == 0)
        return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < size; i++) {
            int b = 0 - arr[i];
            if (map.containsKey(b)) {
                ans = ans + map.get(b);
            }

            // Update arr[i] in the map if it's not already present
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                // If it's already present, increment its count
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        return ans;


	}

    public static void main(String args[])
    {
        int arr[]={-2 ,-12 ,2 ,11 ,12, -2 ,1 ,-2 ,2, -11 ,12 ,2, 6};
        int ans=PairSum(arr,13);
        System.out.println(ans);
    }
}