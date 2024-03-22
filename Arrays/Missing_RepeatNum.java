
import java.util.*;
class Missing_RepeatNum {
    public int[] repeatedNumber(final int[] A) {
        int arr[]=new int[2];
        int missing=0;
        int repeat=0;
        Arrays.sort(A);
        for(int i=1;i<A.length;i++)
        {
            if(A[i]-A[i-1]==2)
            {
                missing=A[i-1]+1;
            }
            
            if(A[i]-A[i-1]==0)
            {
                repeat=A[i];
            }
        }
         // base case if missing value is at start ex. [2,2] out -> 1,2
        if(missing==0)
        {
            missing = A[0]-1;
            // base case if missing value is at last ex. [1,1] out -> 2,1
            if(A[0]==1)
            {
                missing=A[A.length-1]+1;
            }
        }
        
        arr[0]=repeat;
        arr[1]=missing;
        return arr;
    }

    public static void main(String args[])
    {
        int [] A={3,1,2,5,3};
        Missing_RepeatNum solution = new Missing_RepeatNum();
        int arr[]=solution.repeatedNumber(A);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



