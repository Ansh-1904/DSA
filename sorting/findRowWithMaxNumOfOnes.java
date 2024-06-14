


import java.util.*;
public class findRowWithMaxNumOfOnes
{

    public static int lowerBound(ArrayList<Integer> arr, int m, int x)
    {
        int low=0;
        int ans=m;
        int high=m-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr.get(mid)>=x)
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
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        //	  Write your code here.
        int cnt_max=0;
        int index=-1;

        for(int i=0;i<n;i++)
        {
            int cnt_ones=m-lowerBound(matrix.get(i),m,1);
            if(cnt_ones>cnt_max)
            {
                cnt_max=cnt_ones;
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0,0,1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,0,0,0,0)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,0,0,0,0)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1,1,1)));

        int n = 5, m = 5;
        System.out.println("The row with the maximum number of 1's is: " +
        maximumOnesRow(matrix, n, m)+"th Row");
    }
}