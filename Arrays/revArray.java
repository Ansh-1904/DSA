class revArray {

    public static int[] revGivenArray(int arr[])
    {
        int temp;
        int start=0, end=arr.length-1;

        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr1[]=revGivenArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr1[i]+" ");
            
        }
    }
}