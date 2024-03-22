//optimal way O(N)
import java.util.*;
class leaders {

    public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n){
        int max=arr[n-1];
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(max);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                ans.add(max);
            }
        }
        return ans;
    }

                     
    public static void main(String args[]) 
    {
        int n = 6;
        int arr[]=  {10, 22, 12, 3, 0, 6};


        ArrayList<Integer> ans= printLeadersBruteForce(arr,n);
        Collections.sort(ans,Collections.reverseOrder());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }

    }
}



//brute force or better way O(N)
// import java.util.*;

// class leaders{

// public static ArrayList<Integer> 
//                      printLeadersBruteForce(int[] arr, int n){
    
//   ArrayList<Integer> ans= new ArrayList<>();
  
//   for (int i = 0; i < n; i++) {
//     boolean leader = true;

//     for (int j = i + 1; j <n; j++) if (arr[j] > arr[i]) { leader = false; break;}
//     {
//         if (leader)
//         ans.add(arr[i]);
//     }
//   }
  
//   return ans;
   
// }

// public static void main(String args[]) 
// {
//   int n = 6;
//   int arr[]=  {10, 22, 12, 3, 0, 6};


//   ArrayList<Integer> ans= printLeadersBruteForce(arr,n);
  
//   for (int i = 0; i < ans.size(); i++) {
//     System.out.print(ans.get(i)+" ");
//   }

// }
// }