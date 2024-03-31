//lengthOfLongestSubarrayWithSumZero
//T.C O(NLogn)
import java.util.*;
class lengthOfLongestSubarrayWithSumZero {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maximum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==0){
                maximum=i+1;
            }
            else{
                if(map.get(sum)!=null)
                {
                    maximum=Math.max(maximum,i-map.get(sum));
                }else{
                    map.put(sum,i);
                }
            }
        }
        return maximum;
    }

    public static void main(String args[]) 
    { 
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(getLongestZeroSumSubarrayLength(a));
    } 
}





//lengthOfLongestSubarrayWithSumZero
//T.C O(N^2)

// class lengthOfLongestSubarrayWithSumZero {
//     public static int getLongestZeroSumSubarrayLength(int []arr){
//         // Write your code here.
//         int maximum=0;
//         for(int i=0;i<arr.length;i++){
//             int sum=0;
//             for(int j=i;j<arr.length;j++)
//             {
//                 sum+=arr[j];
//                 if(sum==0)
//                 {
//                     maximum=Math.max(maximum,j-i+1);
//                 }
//             }
//         }
//         return maximum;
//     }

//     public static void main(String args[]) 
//     { 
//         int a[] = {9, -3, 3, -1, 6, -5};
//         System.out.println(getLongestZeroSumSubarrayLength(a));
//     } 
// }

