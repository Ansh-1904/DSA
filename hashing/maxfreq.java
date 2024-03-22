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
			map.put(arr[i], 1);
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
        int arr[]={2,12,2,11,12,2,1,2,2,11,12,2,6};
        int smallAns=maxFrequencyNumber(arr);
        System.out.print(smallAns);
        
    }
}