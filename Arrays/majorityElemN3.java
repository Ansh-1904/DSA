//majority elem greater than N/3
//brute force approach
import java.util.*;
class majorityElemN3 {

    public static ArrayList<Integer> majorityElem(int arr[])
    {
        ArrayList<Integer> ans =new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            if(ans.size()==0 || ans.get(0)!=arr[i])
            {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    // counting the frequency of v[i]
                    if (arr[j] == arr[i]) {
                        cnt++;
                    }
                }

                // check if frquency is greater than n/3:
                if (cnt > (n / 3))
                    ans.add(arr[i]);
            }
            if (ans.size() == 2) break;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,3,3,2,2,2};
        ArrayList<Integer> ans=majorityElem(arr);
        for(Integer item:ans)
        {
            System.out.print(item+" ");
            
        }
    }
}