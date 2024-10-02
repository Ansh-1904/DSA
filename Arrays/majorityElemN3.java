//majority elem greater than N/3
//optimal force approach
import java.util.*;
class majorityElemN3 {

    public static List<Integer> majorityElem(int nums[])
    {
        List<Integer> ans=new ArrayList<>();
        int elem1=Integer.MIN_VALUE;
        int elem2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(count1==0 && elem2!=nums[i])
            {
                elem1=nums[i];
                count1=1;
            }
            else if(count2==0 && elem1!=nums[i])
            {
                elem2=nums[i];
                count2=1; 
            }
            else if(nums[i]==elem1)
            {
                count1++;
            }
            else if(nums[i]==elem2)
            {
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;count2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==elem1)
            {
                count1++;
            }
            if(nums[i]==elem2)
            {
                count2++;
            }
        }
        int mini = (n / 3) + 1;
        if(count1>=mini)
        {
            ans.add(elem1);
        }
        if(count2>=mini)
        {
            ans.add(elem2);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        // int[] arr={1,1,1,3,3,2,2,2};
        int[] arr={0,0,0};
        List<Integer> ans=majorityElem(arr);
        for(Integer item:ans)
        {
            System.out.print(item+" ");
            
        }
    }
}





//majority elem greater than N/3
//better force approach
// import java.util.*;
// class majorityElemN3 {

//     public static List<Integer> majorityElem(int v[])
//     int n=nums.length;
//         List<Integer> ans=new ArrayList<>();
//         Map<Integer,Integer> map=new HashMap<>();
//         int mini=(n/3)+1;
//         for(int i=0;i<n;i++)
//         {
//             if(map.containsKey(nums[i]))
//             {
//                 map.put(nums[i],map.get(nums[i])+1);
//             }
//             else{
//                 map.put(nums[i],1);
//             }
//             if(map.get(nums[i])==mini)
//             {
//                 ans.add(nums[i]);
//             }
//             if(ans.size()==2)
//             {
//                 break;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         // int[] arr={1,1,1,3,3,2,2,2};
//         int[] arr={1,2};
//         List<Integer> ans=majorityElem(arr);
//         for(Integer item:ans)
//         {
//             System.out.print(item+" ");
            
//         }
//     }
// }

    






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