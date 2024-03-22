import java.util.*;
class removeDuplicates {

    public static ArrayList<Integer> removeDuplicates(int arr[])
    {
        ArrayList<Integer> output=new ArrayList<>();
        HashMap<Integer,Boolean> seen = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(seen.containsKey(arr[i])) //O(1)
            {
                continue;
            }
            output.add(arr[i]);  
            seen.put(arr[i],true);  //O(1)
        }
        return output;
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,6,100000,6,1,2};
        ArrayList<Integer> output=removeDuplicates(arr);
        for(int i=0;i<output.size();i++)
        {
            System.out.print(output.get(i)+" ");
        }
    }
}