import java.util.ArrayList;
import java.util.HashMap;

public class longestConsecutiveSequence {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		
		ArrayList<Integer> output=new ArrayList<>();
		HashMap<Integer , Boolean> map=new HashMap<>();
		for(int val:arr)
		{
			map.put(val, true);
		}

		for(int val:arr)
		{
			if(map.containsKey(val-1))
			{
				map.put(val, false);
			}
		}

		int maxLength=0;
		int maxStartPoint=0;
		for(int val:arr)
		{			
			if(map.get(val)==true)
			{
				int tempLength=1;
				int tempStartPoint=val;
				while(map.containsKey(val+tempLength))
				{
					tempLength++;
				}
				if(tempLength>maxLength)
				{
					maxLength=tempLength;
					maxStartPoint=tempStartPoint;
				}
			}
		}
		int ans=maxStartPoint+maxLength-1;
		output.add(maxStartPoint);
		output.add(ans);
		return output;
    }

    public static void main(String args[])
    {
        int arr[]={10,15,9,1,11,8,6,15,3,12,2};
        ArrayList<Integer> output=new ArrayList<>();
        output=longestConsecutiveIncreasingSequence(arr);
        for(int val:output)
        {
            System.out.print(val+" ");
        }
    }
}