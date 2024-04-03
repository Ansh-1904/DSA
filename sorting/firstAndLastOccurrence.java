class firstAndLastOccurrence {

    public static int firstPos(int arr[], int low, int high,int x)
    {
        
        int first=-1;
        while(low<=high)
        {

            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;
    }

    public static int lastPos(int arr[], int low, int high,int x)
    {
        
        int last=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }

    public static int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        int firstAns=firstPos(nums,0,nums.length-1,target);
        int lastAns=lastPos(nums,0,nums.length-1,target);
        if(firstAns==-1) 
        {
            return ans;
        }
        else{
            
            ans[0]=firstAns;
            ans[1]=lastAns;
        }
        return ans; 
    }

    public static void main(String args[]) {
        int key = 13;
        int[] v = {3,4,13,13,13,20,40};
    
        // returning the last occurrence index if the element is present otherwise -1
        System.out.println(searchRange(v, key));
      }
}





// class firstAndLastOccurrence {

//     public static int lowerBound(int arr[], int low, int high,int x)
//     {
//         int ans=arr.length;
//         while(low<=high)
//         {
//             int mid=(low+high)/2;
//             if(arr[mid]>=x)
//             {
//                 ans=mid;
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//             }
//         }
//         return ans;
//     }

//     public static int upperBound(int arr[], int low, int high,int x)
//     {
//         int ans=arr.length;
//         while(low<=high)
//         {
//             int mid=(low+high)/2;
//             if(arr[mid]>x)
//             {
//                 ans=mid;
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//             }
//         }
//         return ans;
//     }

//     public static int[] searchRange(int[] nums, int target) {
//         int [] ans={-1,-1};
//         int lb=lowerBound(nums,0,nums.length-1,target);
//         int ub=upperBound(nums,0,nums.length-1,target);
//         if(lb==nums.length || nums[lb]!=target) 
//         {
//             return ans;
//         }
//         else{
            
//             ans[0]=lb;
//             ans[1]=ub-1;
//         }
//         return ans; 
//     }

//     public static void main(String args[]) {
//         // int key = 13;
//         // int key = 8;
//         int key = 40;
//         int[] v = {3,4,13,13,13,20,40};
//         int ans[]=searchRange(v, key);
//         // returning the last occurrence index if the element is present otherwise -1
//         for(Integer it:ans)
//         {
//             System.out.print(it+" ");
            
//         }
//       }
// }