// Lecture notes for 02/12/2020
class Lect16 {

    public static void main(String[] args){
        // Arrays of arrays

        int[] a = {18, 19, 20, 21};

        double[] b = {1.8, 1.9, 2.0, 2.1};

        int[][] c = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        int[][] d = {{5, 9}, {2, 5, 7, 3, 2}, {8, 9, 6}};
        /**
         * d[0] ==> {5, 9}
         * d[1] ==> {2, 5, 7, 3, 2}
         * d[2] ==> {8, 9, 6}
         * d.length ==> 3
         * d[1].length ==> 5
         * d[1][2] ==> 7
         * d[2][0] ==> 8
         */

        
        // print:
        /**
         * 5 9
         * 2 5 7 3 2
         * 8 9 6
         */
        for(int i = 0; i < d.length; i++) {
            for(int j = 0; j < d[i].length; j++){
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

        // {{0, 0, 0, 0, 0,}, {0, 0, 0, 0, 0,}, {0, 0, 0, 0, 0,}}
        int[][] e = new int[3][5];
        // The arrays in e have fixed length.
        /** 2d table of e:
         *           0 0 0 0 0
         *           0 0 0 0 0
         *           0 0 0 0 0
         */

        /** f = 
         *       34 53 86 93
         *       63 92 12 19
         *       31 76 73 24
         * 
         *  number of rows: f.length ==> 3
         *  number of columns: f[0].length ==> 4
         */
    }

    // Print row i
    static void printRow(int[][] d, int i){
        for(int j = 0; j < d[i].length; j++){
            System.out.print(d[i][j] + " ");
        }
    }

    // Print column j
    static void printColumn(int[][] d, int j){
        for(int i = 0; i < d.length; i++){
            System.out.print(d[i][j] + " ");
        }
    }
    
    // Print the row numbers that contain a least one value larger than a target (e.g. >= 85)
    static void largerThanTarget(int[][] d, int target){
        boolean targetFound = false;
        for(int i = 0; i < d.length; i++){
            for(int j = 0; j < d[i].length && !targetFound; j++){
                if(d[i][j] >= target){
                    System.out.println(d[i]);
                    // break;   (avoid using break unless you know what you are doing and what break does) or
                    // j = d[i].length or
                    targetFound = true;
                }
            }
        }
    }
}