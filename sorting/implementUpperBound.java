public class implementUpperBound {

    public static int ansThroughBinSearch(int arr[], int low, int high,int x)
    {
        int ans=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<=x)
            {
                
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        return ansThroughBinSearch(arr,0,arr.length-1,x);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int n = 6, x = 9;
        int ind = upperBound(arr, x, n);
        System.out.println("The upper bound is the index: " + ind);
    }


}
