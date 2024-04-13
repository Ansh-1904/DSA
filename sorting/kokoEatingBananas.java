//optimal approach
class kokoEatingBananas {

    public static int findMax(int[] piles)
    {
        int maxi=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0;i<n;i++)
        {
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }

    public static int RequireTime(int piles[], int mid)
    {
        int hr=0;
        for(int i=0;i<piles.length;i++)
        {
            hr+=Math.ceil((double)(piles[i])/(double)(mid));
        }
        return hr;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int high=findMax(piles);
        int ans=-1;;

        while(low<=high)
        {
            int mid=(low+high)/2;
            int reqTime= RequireTime(piles,mid);
            if(reqTime<=h)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] piles = {7, 15, 6, 3};
        int h = 8;
        int ans = minEatingSpeed(piles, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}


//brute force
// public class kokoEatingBananas {
//     public static int findMax(int[] v) {
//         int maxi = Integer.MIN_VALUE;;
//         int n = v.length;
//         //find the maximum:
//         for (int i = 0; i < n; i++) {
//             maxi = Math.max(maxi, v[i]);
//         }
//         return maxi;
//     }

//     public static int calculateTotalHours(int[] v, int hourly) {
//         int totalH = 0;
//         int n = v.length;
//         //find total hours:
//         for (int i = 0; i < n; i++) {
            
            
//             totalH += Math.ceil((double)(v[i]) / (double)(hourly));
//             if(hourly==4) System.out.println(totalH);
//         }
//         return totalH;
//     }

//     public static int minimumRateToEatBananas(int[] v, int h) {
//         //Find the maximum number:
//         int maxi = findMax(v);

//         //Find the minimum value of k:
//         for (int i = 1; i <= maxi; i++) {
//             int reqTime = calculateTotalHours(v, i);
//             if (reqTime <= h) {
//                 return i;
//             }
//         }

//         //dummy return statement
//         return maxi;
//     }

//     public static void main(String[] args) {
//         int[] v = {3,6,7,11};
//         int h = 8;
//         int ans = minimumRateToEatBananas(v, h);
//         System.out.println("Koko should eat at least " + ans + " bananas/hr.");
//     }
// }



