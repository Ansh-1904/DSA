class capToShipPackagesWithinDdays {
    public static int daysReq(int weight[], int maxCap)
    {
        int days=1;
        int load=0;
        for(int i=0;i<weight.length;i++)
        {
            if(load+weight[i]>maxCap)
            {
                days++;
                load=weight[i];
            }
            else{
                load+=weight[i];
            }
            
        }
        return days;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int maxCap=0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i <weights.length ; i++) {
            maxi = Math.max(maxi, weights[i]);
            maxCap+=weights[i];
        }
        int low=maxi;
        int high=maxCap;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int possibleAnswer=daysReq(weights,mid);
            if(possibleAnswer<=days)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
        // int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        // int d = 5;
        int ans = shipWithinDays(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}