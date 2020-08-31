class Lect17{
    public static void main(String[] args){
        
    }

    /** f = 
     *       34 53 86 93
     *       63 92 12 19
     *       31 76 73 24
     */
    static int maxValueRow(int[][] f){
        int max = f[0][0];
        int rMax = 0;
        for(int i = 0; i < f.length; i++){
            for(int j = 0; j < f[i].length; j++){
                if(f[i][j] > max){
                    max = f[i][j];
                    rMax = i;
                }
            }
        }
        return rMax;
    }

    /** g = 
     *          12 30
     *          80 70
     *          63 15
     *          25 29
     *          12 83
     */
    static int maxSumRow(int[][] g){
        int maxSum = rowSum(g, 0);
        int rMaxSum = 0;
        for(int i = 1; i < g.length; i++){
            int sum = rowSum(g, i);
            if(sum > maxSum){
                maxSum = sum;
                rMaxSum = i;
            }
        }
        return rMaxSum;
    }
    static int rowSum(int[][] g, int i){
        int sum = 0;
        for(int j = 0; j < g[i].length; j++){
            sum += g[i][j];
        }
        return sum;
    }
}