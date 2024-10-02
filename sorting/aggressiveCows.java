import java.util.*;


public class aggressiveCows {

    public static boolean canWePlace(int nums[], int dist, int cows)
    {
        int count=1;
        int lastCow=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-lastCow>=dist)
            {
                count++;
                lastCow=nums[i];
            }
            if(count>=cows) return true;
        }
        return false;
    }

    public static int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int low=0;
        int n=nums.length;
        int ans=-1;
        int high= nums[n-1]-nums[0];
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(canWePlace(nums,mid,k)==true)
            {
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(nums, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}