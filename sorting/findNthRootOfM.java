
public class findNthRootOfM {

    public static int find(int n,int mid)
    {
        int ans = (int) Math.pow(mid, n);
        return ans;
    }
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low=1;
        int high=m;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int value=find(n,mid);
            if(value==m) return mid;
            else if(value>m) 
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n=3;
        int m=27;
        // int n=4;
        // int m=69;
        int answer=NthRoot(n,m);
        System.out.println(answer);
        
    }
}
