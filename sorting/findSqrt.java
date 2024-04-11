
public class findSqrt {

	public static int sqrtN(int N) {
		/*
		 * Write your code here
		 */

		 int low=0;
		 int high=N-1;
		 while(low<=high)
		 {
			 int mid=(low+high)/2;
			 int val=mid*mid;
			 if(val<=N)
			 {
				 low=mid+1;
			 }
			 else{
				 high=mid-1;
			 }
		 }
		 return high;
	}

    public static void main(String[] args) {
        // int N=36;
        int N=72;
        // int N=28;
        int ans=sqrtN(N);
        System.out.println(ans);
        
    }


}
