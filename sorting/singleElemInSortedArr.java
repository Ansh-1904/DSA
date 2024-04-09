//Brute force approach
//T.C O(N)
class singleElemInSortedArr {
    public static int singleNonDuplicate(int[] arr) {
        if(arr.length==1)
        {
            return arr[0];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                if(arr[i]!=arr[i+1]) return arr[i];
            }
            else if(i==arr.length-1){
                if(arr[i]!=arr[i-1]) return arr[i];
            }
            else{
                if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]) return arr[i];
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