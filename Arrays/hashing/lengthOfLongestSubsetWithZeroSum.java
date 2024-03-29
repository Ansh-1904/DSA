import java.util.*;
public class lengthOfLongestSubsetWithZeroSum {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		int maxLen=0;
		int sum=0;
		int i=-1;
		map.put(sum, i);

		while(i<arr.length-1)
		{
			i++;
			sum=sum+arr[i];
			if(map.containsKey(sum)==false)
			{
				map.put(sum, i);
			}
			else{
				int len=i-map.get(sum);
				if(len>maxLen)
				{
					maxLen=len;
				}
			}
		}
		return maxLen;
	}

    public static void main(String args[])
    {
        int arr[]={2,8,-3,-5,2,-4,6,1,2,1,-3,4};
        int output=lengthOfLongestSubsetWithZeroSum(arr);
        System.out.println(output);
    }
}