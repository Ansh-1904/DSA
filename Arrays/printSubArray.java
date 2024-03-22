class printSubArray{
    public static void printSubArray(int arr[])
    {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++){
                int currSum=0;
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    currSum=currSum+arr[k];
                   System.out.print(arr[k] +" ");
                    
                }
                System.out.println("");
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
                System.out.println("");
                
            }
            System.out.println("");

            System.out.println("Max SubArray = "+maxSum);
            
            
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubArray(arr);
    }
}

