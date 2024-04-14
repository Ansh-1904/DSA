class minDayToMakeMbouquet {

    public static boolean possible(int[] bloomDay, int day, int m,int k)
    {
        int count=0;
        int noofB=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=day)
            {
                count++;

            }
            else{
                noofB+=(count/k);
                count=0;
            }
        }
        noofB+=(count/k);
        return noofB>=m;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        if(bloomDay.length< val) return -1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i <bloomDay.length ; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int low=mini;
        int high=maxi;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)==true){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        // int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int[] arr = {1 ,2 ,1 ,2 ,7 ,2 ,2 ,3 ,1};
        int k = 3;
        int m = 2;
        int ans = minDays(arr, m, k);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}