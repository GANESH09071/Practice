class Spiral {
    public int[][] generateMatrix(int n) 
    {
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int num = 1;

        while (left <= right && top <= bottom) 
            {
            for (int i = left; i <= right; i++) 
                {
                matrix[top][i] = num++;
                }
            top++;

            for (int i = top; i <= bottom; i++) 
                {
                matrix[i][right] = num++;
                }
            right--;

            if (top <= bottom) 
                {
                for (int i = right; i >= left; i--) 
                    {
                    matrix[bottom][i] = num++;
                    }
                bottom--;
                }

            if (left <= right) 
                {
                for (int i = bottom; i >= top; i--) 
                    {
                    matrix[i][left] = num++;
                    }
                left++;
                }
        }
        return matrix;

    }

    public static void main(String[] args) 
    {
        Spiral obj = new Spiral();
        int[][] result = obj.generateMatrix(3);
        for (int i = 0; i < result.length; i++) 
            {
            for (int j = 0; j < result[i].length; j++) 
                {
                System.out.print(result[i][j] + " ");
                }
            System.out.println();
            }

    }
}