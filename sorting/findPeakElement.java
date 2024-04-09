class findPeakElement {

    public static int findPeak(int[] arr) {
        int n=arr.length;
        if(n==1) return 0;
        
        if(arr[0]>arr[1]) return 0;
        
        if(arr[n-1]>arr[n-2]) return n-1;

        int low=1;
        int high=n-2;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;

            else if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        // int arr[]={1,2,1,3,5,6,4};
        // int arr[]={1,5,1,2,1};
        // int arr[]={5,4,3,2,1};
        // int arr[]={1,2,3,4,5};
        int ans=findPeak(arr);
        System.out.println(ans);
        
    }
}