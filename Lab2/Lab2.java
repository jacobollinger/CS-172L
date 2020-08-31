class Lab2{

    // Sums an array of numbers.
    static int sum(int[] a){
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            temp += a[i];
        }
        return temp;
    }

    // Equates the average of an array of numbers.
    static double average(int[] a){
        double temp = 0;
        for(int i = 0; i < a.length; i++){
            temp += a[i];
        }
        return temp / a.length;
    }

    // Checks for positives in an array.
    static boolean anyPositive(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] > 0){
                return true;
            }
        }
        return false;
    }

    // Checks that all numbers are positive in an array.
    static boolean allPositive(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] < 0){
                return false;
            }
        }
        return true;
    }

    // Checks if an array is sorted numerically.
    static boolean sorted(int[] a){
        for(int i = 1; i < a.length; i++){
            if(a[i] < a[i - 1]){
                return false;
            }
        }
        return true;
    }

    // Tests if any integers next to each other in the array are similar.
    static boolean equalNeighbors(int[] a){
        for(int i = 1; i < a.length; i++){
            if(a[i] == a[i - 1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] a1= {3,6,8,8,5,9};
        int[] a2 = {-3, -6, 8, -8, 5, -9};
        int[] a3= {3,6,8,8,9};

        System.out.println(sum(a1));
        System.out.println(average(a1));
        System.out.println(anyPositive(a2));
        System.out.println(allPositive(a1));
        System.out.println(sorted(a3));
        System.out.println(equalNeighbors(a2));
    }
}