import java.util.*;
class ChocolateDistribution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++)
        {
            if(a.get(i+m-1)-a.get(i)<min_diff)
            {
                min_diff=a.get(i+m-1)-a.get(i);
            }
            
        }
        return min_diff;
        
    }

    public static void main(String args[])
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(3);
        a.add(2);
        a.add(4);
        a.add(9);
        a.add(12);
        a.add(56);
        ChocolateDistribution chocolateDistribution = new ChocolateDistribution();
        long ans = chocolateDistribution.findMinDiff(a, 7, 3);
        System.out.println(ans);
    }
}