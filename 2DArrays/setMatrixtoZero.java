import java.util.*;

//Brute force Approach
//Doesn't work when element inside array contains negative numbers
// public class setMatrixtoZero {


//     public static void setRowZero(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i)
//     {
//         for(int j=0;j<m;j++)
//         {
//             if(matrix.get(i).get(j)!=0)
//             {
//                 matrix.get(i).set(j,-1);
//             }
//         }
//     }

//     public static void setColZero(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j)
//     {
//         for(int i=0;i<n;i++)
//         {
//             if(matrix.get(i).get(j)!=0)
//             {
//                 matrix.get(i).set(j,-1);
//             }
//         }
//     }

//     public static ArrayList<ArrayList<Integer>> setZero(ArrayList<ArrayList<Integer>> matrix, int n, int m)
//     {
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 if(matrix.get(i).get(j)==0)
//                 {
//                     setRowZero(matrix,n,m,i);
//                     setColZero(matrix,n,m,j);
//                 }
//             }
//         }

//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 if(matrix.get(i).get(j)==-1)
//                 {
//                     matrix.get(i).set(j,0);
//                 }
//             }
//         }
//         return matrix;
//     }

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
//         matrix.add(new ArrayList<>(Arrays.asList(1,1,1,0)));
//         matrix.add(new ArrayList<>(Arrays.asList(1,0,1,1)));
//         matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));

//         int n=matrix.size();
//         int m=matrix.get(0).size();

//         ArrayList<ArrayList<Integer>> ans=setZero(matrix,n,m);

//         System.out.println("The Final matrix is: ");
//         for (ArrayList<Integer> row : ans) {
//             for (Integer ele : row) {
//                 System.out.print(ele + " ");
//             }
//             System.out.println();
//         }


//     }
// }

//better approach
public class setMatrixtoZero {


    public static ArrayList<ArrayList<Integer>> setZero(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {

        int row[]=new int[n];
        int col[]=new int[m];



        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    matrix.get(i).set(j,0);
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1,0)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));

        int n=matrix.size();
        int m=matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans=setZero(matrix,n,m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }


    }
}