public class implementLowerBound {

    public static int ansThroughBinSearch(int arr[], int low, int high,int x)
    {
        int ans=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>=x)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        return ansThroughBinSearch(arr,0,arr.length-1,x);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 8;//x=9
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}