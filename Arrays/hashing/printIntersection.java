import java.util.*;
public class printIntersection {

	public static void printIntersectionn(int[] arr1,int[] arr2){
		
        HashMap<Integer,Integer> map1=new HashMap<>();
        
        for(int i=0;i<arr1.length;i++)
        {
            if(map1.containsKey(arr1[i]))
            {
                map1.put(arr1[i],map1.get(arr1[i])+1);
            }
            else{
                map1.put(arr1[i],1);
            }
            
        }
        
        for(int item:arr2)
        {
            if(map1.containsKey(item))
            {
                int freq=map1.get(item);
                if(freq>0)
                {
                    System.out.println(item);
                    map1.put(item, map1.get(item)-1);
                }
            }
        }

        
	
    }

    public static void main(String args[])
    {
        int arr1[]={2, 6, 1, 2};
        int arr2[]={1 ,2, 3, 4, 2};
        printIntersectionn(arr1,arr2);
    }
}