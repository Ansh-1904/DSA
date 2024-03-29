//brute force
//T.C O(n*m)
//S.C O(n*m)

// class rotateMatrixBy90Clockwise {

//     public static int[][] setmatrix90(int [][] matrix , int n, int m)
//     {
//         int rotated[][]=new int[n][m];
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 rotated[j][n-1-i]=matrix[i][j];
//             }
//         }
//         return rotated;
//     }

//     public static void main(String[] args) {
//         int matrix[][]={{1,2,3},
//                         {4,5,6},
//                         {7,8,9}};

//         int n=matrix.length;
//         int m=matrix[0].length;

//         int rotated[][] = setmatrix90(matrix,n,m);
//         System.out.println("Rotated Image");
//         for (int i = 0; i < rotated.length; i++) {
//             for (int j = 0; j < rotated.length; j++) {
//                 System.out.print(rotated[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//better approach
//T.C O(n*m)
//S.C O(1) //since using the same matrix

class rotateMatrixBy90Clockwise {

    public static void setmatrix90(int [][] matrix , int n, int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        System.out.println("Before reverse");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-1-j];
                matrix[i][m-1-j]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        int n=matrix.length;
        int m=matrix[0].length;
        System.out.println("Before transpose");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        setmatrix90(matrix,n,m);
        System.out.println("Rotated Image");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}