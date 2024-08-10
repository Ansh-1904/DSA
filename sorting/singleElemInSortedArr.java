//Optimal Approach
//T.C O(LogN)
class singleElemInSortedArr
{    
    public static int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];

        if(nums[0]!=nums[1]) 
        {
            return nums[0];
        }

        if(nums[n-1]!=nums[n-2])
        {
            return nums[n-1];
        }

        int low=1;
        int high=n-2;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            else if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1]))
            {
                low=mid+1;
            } 
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,8,8};
        // int arr[] = {3, 3, 7, 7, 10, 11, 11};
        int ans = singleNonDuplicate(arr);
        System.out.println(ans);
    }
}


//Brute force approach
//T.C O(N)
// class singleElemInSortedArr {
//     public static int singleNonDuplicate(int[] arr) {
//         if(arr.length==1)
//         {
//             return arr[0];
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             if(i==0)
//             {
//                 if(arr[i]!=arr[i+1]) return arr[i];
//             }
//             else if(i==arr.length-1){
//                 if(arr[i]!=arr[i-1]) return arr[i];
//             }
//             else{
//                 if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]) return arr[i];
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[]={1,1,2,3,3,4,4,8,8};
//         // int arr[] = {3, 3, 7, 7, 10, 11, 11};
//         int ans = singleNonDuplicate(arr);
//         System.out.println(ans);
//     }
// }