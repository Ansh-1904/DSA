import java.util.*;
class pascalsTraingle {

    public static int cal_NCR(int n,int r)
    {
        long result=1;
        for(int i=0;i<r;i++)
        {
            result=result*(n-i);
            result=result/(i+1);
        }
        return (int)result;
    }

    public static int pascalsTraingleAns(int row, int col)
    {
        int element=cal_NCR(row-1,col-1);
        return element;
    }

    public static void printEntireRow(int n)
    {
        for(int c=1;c<n;c++)
        {
            System.out.print(cal_NCR(n-1,c-1)+" ");
        }
        System.out.println("");
        System.out.println("");
    }

    public static List<List<Integer>> pascalsTrainglePattern(int n)
    {
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=n;row++)
        {
            List<Integer> tempList = new ArrayList<>();
            for(int col=1;col<=row;col++)
            {
                tempList.add(cal_NCR(row-1,col-1));
            }
            ans.add(tempList);
        }
        return ans;

    }

    public static void main(String[] args) {
        int row=6;
        int col=3;
        int n=6;
        List<List<Integer>> ans=pascalsTrainglePattern(n);
        for(List<Integer> elem:ans)
        {
            for(Integer it:elem)
            {
                System.out.print(it+" ");
                
            }
            System.out.println("");
            
        }
        System.out.println("");
        int element=pascalsTraingleAns(row,col);
        printEntireRow(n);
        System.out.println("The element at position (r,c) is: " + element);
    }
}