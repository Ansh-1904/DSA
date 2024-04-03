class firstAndLastOccurrence {

    public static int lowerBound(int arr[], int low, int high,int x)
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

    public static int upperBound(int arr[], int low, int high,int x)
    {
        int ans=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
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

    public static int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        int lb=lowerBound(nums,0,nums.length-1,target);
        int ub=upperBound(nums,0,nums.length-1,target);
        if(lb==nums.length || nums[lb]!=target) 
        {
            return ans;
        }
        else{
            
            ans[0]=lb;
            ans[1]=ub-1;
        }
        return ans; 
    }

    public static void main(String args[]) {
        // int key = 13;
        // int key = 8;
        int key = 40;
        int[] v = {3,4,13,13,13,20,40};
        int ans[]=searchRange(v, key);
        // returning the last occurrence index if the element is present otherwise -1
        for(Integer it:ans)
        {
            System.out.print(it+" ");
            
        }
      }
}