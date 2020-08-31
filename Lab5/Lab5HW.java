import java.util.Arrays;

class Lab5HW{
    static boolean equalSumRows(int[][] a){
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                b[i] += a[i][j];
            }
        }
        Arrays.sort(b);
        for(int i = 0; i < b.length - 1; i++){
            if(b[i] == b[i + 1]){
                return true;
            }
        }
        return false;
    }

    static boolean identicalValueSquare(int[][] a, int n){
        for(int i = 0; i <= a.length - n; i++){
            for(int j = 0; j <= a[i].length - n; j++){
                if(checkSquare(a, n, i, j)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean checkSquare(int[][] a, int n, int iStart, int jStart){
        for(int i = iStart; i < iStart + n; i++){
            for(int j = jStart; j < jStart + n - 1; j++){
                if(a[i][j] != a[i][j + 1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[][] a1 = {{3, 5, 4}, {9, 2, 1}, {7, 8, 6}, {1, 2, 6}};
        int[][] a2 = {{4, 5, 6, 7, 8}, {3, 4, 4, 5, 6}, {1, 4, 4, 4, 8}, {3, 4, 4, 4, 5}};

        System.out.println(equalSumRows(a1));

        System.out.println(identicalValueSquare(a2, 3));
    }
}