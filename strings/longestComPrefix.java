class longestComPrefix {
    public static String longCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix=strs[0];

        for(int i=0;i<prefix.length();i++)
        {
            char c=prefix.charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || strs[j].charAt(i)!=c)

                {
                    return prefix.substring(0,i);
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String [] strs={"flower", "flow", "flight"};
        // String [] strs={"dog", "racecar", "ansh"};
        // String [] strs={"", "dog", ""};
        // String [] strs={"", "", ""};
        System.out.println(longCommonPrefix(strs));
        
    }
}