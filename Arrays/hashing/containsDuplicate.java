import java.util.*;
class containsDuplicate {

    public static boolean containsDuplicateAnswer(int list[])
    {
        HashSet<Integer> map=new HashSet<>();

        for(int i=0;i<list.length;i++)
        {
            if(map.contains(list[i])) return true;
            map.add(list[i]);
            
        }
        return false;
    }

    public static void main(String[] args) {
        int list[]={1,2,3,1};
        boolean ans=containsDuplicateAnswer(list);
        System.out.println(ans);
        
    }
}