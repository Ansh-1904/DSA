
class countSubArrayOfGivenSum  {
    // Function to find a continuous sub-array which adds up to a given number.
    public static int subarraySum(int arr[], int n, int s) {
        int ans = 0;
        int start = 0;
        int end = 0;
        int count=0;

        while (end < n) {
            ans += arr[end];
            
            while (ans > s && start <= end) {
                ans -= arr[start];
                start++;
            }

            if (ans == s) {
                
                count++;
            }

            end++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int ans=subarraySum(arr, arr.length, 12);
        System.out.println(ans);
        
        
    }
}
