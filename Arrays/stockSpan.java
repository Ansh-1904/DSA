class stockSpan {

    public static int[] findStockSpan(int arr[])
    {
        int arr1[]=new int[arr.length];
        arr1[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i-1]>arr[j])
                {
                    arr1[j]=1;
                    break;
                }
                if(arr[i-1]<arr[j])
                {
                    arr1[j]=2;
                    break;
                }
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,75,85};
        int arr1[]=findStockSpan(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}