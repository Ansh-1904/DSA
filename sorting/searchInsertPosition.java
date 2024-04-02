class searchInsertPosition {

    public static int ansThroughBinSearch(int []arr,int low, int high,int x)
    {
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]<x)
            {
                ans=mid+1; 
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;

    }

    public static int searchInsert(int[] arr, int x) {
        return ansThroughBinSearch(arr,0,arr.length-1,x);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        int ind = searchInsert(arr, x);
        System.out.println("The index is: " + ind);
    }
}
