class nextLargerElement {
//wrong
    public static int[] findNextLargest(int arr[])
    {
        int i=0;
        int j=0;
        int n=arr.length;
        int arr1[]=new int[n];
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    arr1[i]=arr[j];
                    break;
                }
                if(arr[j]<arr[i])
                {
                    arr1[i]=-1;
                    break;
                }
            }
        }
        arr1[n-1]=-1;
        return arr1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4};
        int arr1[]=findNextLargest(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}