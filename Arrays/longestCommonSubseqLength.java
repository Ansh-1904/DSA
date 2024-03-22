import java.util.*;
class longestCommonSubseqLength {

    public static int longestSuccessiveElements(int a[])
    {
        Arrays.sort(a);
        int n=a.length;
        if(n==0) return 0;
        int count=1;
        int longest=1;
        int smaller=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(a[i]-1==smaller)
            {
                count++;
                smaller =a[i];
            }
            else if(a[i]!=smaller){
                count=1;
                smaller=a[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }

    public static void main(String[] args) {
        // int[] a = {100, 200, 1, 2, 3, 4};
        int[] a = {3,8,5,7,6};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}