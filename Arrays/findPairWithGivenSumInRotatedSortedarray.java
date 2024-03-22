class findPairWithGivenSumInRotatedSortedarray {

    public static boolean result(int arr[], int sum)
    {
        int n=arr.length;
        int i;
        for( i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[i+1])
            {
                break;
            }
        }

        //r is now the larger element
        int r=i;

        //l is now the smaller element
        int l=(i+1)%n;

        //Keep moving either l or r till they meet
        while(l!=r)
        {
            // If we find a pair with sum x, we
            // return true
            if(arr[r]+arr[l]==sum){
                return true;
            }
            // If current pair sum is less, move
            // to the higher sum
            if(arr[r]+arr[l]<sum)
            {
                l=(l+1)%n;
            }
            // Move to the lower sum side
            else{
                r=(n+r-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={11,15,6,8,9,10};
        if(result(arr,16))
        {
            System.out.println("true");
            
        }
        else{
            System.out.println("false");
            
        }

    }
}