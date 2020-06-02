package program;

public class SaddlePointInMatrix
{

    public static String findSaddlePoint( int[][] matrix)
    {
        boolean isSaddlePointInMatrix = false;
        int saddlePointValue = Integer.MIN_VALUE;

        for (int i=0; i< matrix.length; i++)
        {
            int rowMin = matrix[i][0];
            int colIndex = 0;

            boolean isSaddlePoint = true;

            //Find the smallest elemnet in the ith row
            for( int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] < rowMin)
                {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // Checking rowMin is also the largest element in the column

            for(int k =0; k < matrix.length; k++)
            {
                if(matrix[k][colIndex] > rowMin)
                {
                    isSaddlePoint = false;
                    break;
                }
            }

            if(isSaddlePoint)
            {
                isSaddlePointInMatrix = true;
                saddlePointValue = rowMin;
            }
        }

        String str = null;
        if(isSaddlePointInMatrix)
        {
            str = "Saddle point is: " + saddlePointValue;
        }
        else
        {
            str = "No saddle point found in the given matrix";
        }

        return str;
    }


    public  static void main( String[] args )
    {

        int[][] matrix1 = {
                {5, 2, 3},
                {8, 7, 9},
                {2, 4, 9}
        };

        int[][] matrix2 = {
                {1, 2, 4, 7},
                {3, 9, 6, 6},
                {6, 8, 5, 7}
        };

        int[][] matrix3 = {
                {5, 3, 4},
                {9, 8, 12},
                {2, 4, 9}
        };

        int[][] matrix4 = {
                {5, 3, 4},
                {8, 7, 12},
                {12, 34, 19}
        };

       System.out.println(findSaddlePoint(matrix1));
       System.out.println(findSaddlePoint(matrix2));
       System.out.println(findSaddlePoint(matrix3));
       System.out.println(findSaddlePoint(matrix4));

    }
}
