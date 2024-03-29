//majority elemenet >n/2
import java.util.*;
public class maxfreq {

    public static int maxFrequencyNumber(int[] arr){ 
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i], 1);
			}
			
		}
		int max=0;
		int ans=Integer.MIN_VALUE;
		for(int item:arr)
		{
			if(map.get(item)>max)
			{
				max=map.get(item);
				ans=item;
			}
		}
		return ans;
    }

    public static void main(String args[])
    {
        int arr[]={2 ,2, 1, 3, 1, 1, 3, 1, 1};
        int smallAns=maxFrequencyNumber(arr);
        System.out.print(smallAns);
        
    }
}