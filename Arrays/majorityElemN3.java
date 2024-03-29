//majority elem greater than N/3
//better force approach
import java.util.*;
class majorityElemN3 {

    public static List<Integer> majorityElem(int v[])
    {
        int n = v.length; //size of the array
        List<Integer> ls = new ArrayList<>(); // list of answers

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // least occurrence of the majority element:
        int mini = (n / 3) + 1;

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);

            //checking if v[i] is
            // the majority element:
            if (mpp.get(v[i]) == mini) {
                ls.add(v[i]);
            }
            if (ls.size() == 2) break;
        }
        return ls;
    }
    public static void main(String[] args) {
        // int[] arr={1,1,1,3,3,2,2,2};
        int[] arr={1,2};
        List<Integer> ans=majorityElem(arr);
        for(Integer item:ans)
        {
            System.out.print(item+" ");
            
        }
    }
}

    






//majority elem greater than N/3
//brute force approach
// import java.util.*;
// class majorityElemN3 {

//     public static ArrayList<Integer> majorityElem(int arr[])
//     {
//         ArrayList<Integer> ans =new ArrayList<>();
//         int n=arr.length;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(ans.size()==0 || ans.get(0)!=arr[i])
//             {
//                 int cnt = 0;
//                 for (int j = 0; j < n; j++) {
//                     // counting the frequency of arr[i]
//                     if (arr[j] == arr[i]) {
//                         cnt++;
//                     }
//                 }

//                 // check if frquency is greater than n/3:
//                 if (cnt > (n / 3))
//                     ans.add(arr[i]);
//             }
//             if (ans.size() == 2) break;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int[] arr={1,1,1,3,3,2,2,2};
//         ArrayList<Integer> ans=majorityElem(arr);
//         for(Integer item:ans)
//         {
//             System.out.print(item+" ");
            
//         }
//     }
// }