import java.util.*;
class anargrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1:");
        String str = sc.nextLine();
        System.out.println("Enter string 2:");
        String str1 = sc.nextLine();

        if(str.length()==str1.length())
        {
            char[] char1=str.toCharArray();
            char[] char2=str1.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);
            boolean res=Arrays.equals(char1,char2);
            System.out.println(res);
        }
    }
}