class selectionSort {
    public static void main(String[] args) {
        int arr[]={9,3,6,2,0};
        int n=arr.length;

        for(int i=0;i<=n-2;i++)
        {
            int smallest=i;
            for(int j=i+1;j<=n-1;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            for(int k=0;k<n;k++)
            {
                System.out.print(arr[k]+" ");
                
            }
            System.out.println("");
        }
        System.out.println("");
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
    }
}