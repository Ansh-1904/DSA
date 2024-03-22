class maxAndMinElem {

    public static void minAndMax(int arr[])
    {
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];

            }
            
             
        }
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]>large)
            {
                large=arr[i];

            }
             
        }
        System.out.println("MIN Element = "+small);
        System.out.println("MAX Element = "+large);
    }

    public static void main(String[] args) {
        int arr[]={3,1,9,7};
        minAndMax(arr);
    }
}