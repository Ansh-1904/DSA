import java.util.*;

public class exactUniqChar {

	public static String uniqueChar(String str){
		
		HashMap<Character, Integer> map=new HashMap<>();
		String s="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!map.containsKey(ch))
			{
				s=s+ch;
				map.put(ch, 1);
			}
		}
		return s;
	}

    public static void main(String args[])
    {
        String str="ababcdd";
        String s=uniqueChar(str);
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}


