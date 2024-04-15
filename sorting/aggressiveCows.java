import java.util.*;


public class aggressiveCows {

    public static boolean canWePlaceCow(int stalls[], int distance, int cows)
    {
        int countCows=1;
        int lastCow=stalls[0];
        for(int i=1;i<stalls.length;i++)
        {
            if(stalls[i]-lastCow>=distance)
            {
                lastCow=stalls[i];
                countCows++;
            }
        }
        return countCows>=cows;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        int n=stalls.length;
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[n-1]-stalls[0];
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(canWePlaceCow(stalls,mid,k)==true)
            {
                int ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return high;
    }

    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}