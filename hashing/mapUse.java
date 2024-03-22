import java.util.*;
class mapUse{
    public static void main(String args[])
    {
        HashMap<String , Integer> map=new HashMap<>();
        //insert
        map.put("abc",1);
        map.put("def",1);
        map.put("abc",2);
        map.put("pqr",1);
        System.out.println("Size: "+map.size());
        
        //presence
        if(map.containsKey("abc"))
        {
            System.out.println("Has abc");
        }
        //get value
        int v=0;
        if(map.containsKey("abc"))
        {
            v=map.get("abc");
        }
        
        System.out.println(v);

        //remove value
        int s=map.remove("abc");
        System.out.println(s);
        

        if(map.containsValue(1))  //O(n)
        {
            System.out.println("has 1 a value");
        }
        
        //iterate
        Set<String> keys=map.keySet();
        for(String str:keys)
        {
            System.out.println(str);
            
        }
    }
}