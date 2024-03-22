import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        // System.out.println(arr.size());
        // System.out.println(arr.get(1));
        arr.add(1,15);
        // System.out.println(arr.get(1));
        arr.remove(2);
        
        arr.add(40);
        arr.add(50);
        
        Integer i=10;
        arr.remove(i);
        arr.set(0,100);
        for(int j=0;j<arr.size();j++)
        {
            System.out.println(arr.get(j));
        }

        //Enhanced or for-each loop
        for(int k: arr)
        {
            System.out.println(k);
        }
    }

}
