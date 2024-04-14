//optimal approach
//T.C O(LogN)
class kthMissingPosNum {

    public static int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);
        
            if(missing<k)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low+k;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10};
        int k = 4;
        int ans = findKthPositive(arr, k);
        System.out.println("The missing number is: " + ans);
    }
}

//brute force approach
//T.C O(N)
// class kthMissingPosNum {

//     public static int findKthPositive(int[] arr, int k) {
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<=k) k++;
//             else break;
//         }
//         return k;
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 7, 9, 10};
//         int k = 4;
//         int ans = findKthPositive(arr, k);
//         System.out.println("The missing number is: " + ans);
//     }
// }


