class Lab5{

    static int columnSum(int[][] a, int j){
        int sum = 0;
        for(int i = 0; i < a.length -1; i++){
            sum += a[i][j];
        }
        return sum;
    }

    static double columnAverage(int[][] a, int j){
        double sum = columnSum(a, j);
        return sum / a.length;
    }

    static int maxSumColumn(int[][] a){
        int maxSum = columnSum(a, 0);
        int max = 0;
        for(int j = 1; j < a.length - 1; j++){
            if(maxSum < columnSum(a, j)){
                maxSum = columnSum(a, j);
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[][] a1 = {{3, 5, 4}, {9, 2, 1}, {7, 8, 6}, {1, 2, 6}};
        int j = 0;

        System.out.println(columnSum(a1, j));

        System.out.println(columnAverage(a1, j));

        System.out.println(maxSumColumn(a1));
    }
}