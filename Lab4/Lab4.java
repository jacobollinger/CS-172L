class Lab4{
    
    static boolean repeatedValue(int[] a){
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] == a[i + 1]){
                return true;
            }
        }
        return false;
    }

    static boolean equal(int[] a, int[] b){
        if(a.length == b.length){
            for(int i = 0; i < a.length; i++){
                if(a[i] != b[i]){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }

    static int mostFrequent(int[] a){
        int oldZ = 0;
        int y = a[0]; // 0;
        int z = 1; // 0;

        for(int i = 0; i < a.length - 1; i++){
            if(a[i] == a[i + 1]){
                z++;
            }
            else if(z > oldZ){
                oldZ = z;
                y = a[i];
                z = 1;
            }
        }
        return y;
    }

    public static void main(String[] args) {
        int[] a1 = {2, 3, 4, 4, 5, 7, 10, 10, 10, 12};
        int[] b1 = {2, 3, 4, 4, 5, 7, 10, 10, 10, 12};
        int[] a2 = {3, 5, 6, 8, 10};
        int[] a3 = {2, 3, 5, 5, 5, 6, 7, 7, 9, 10, 22};

        System.out.println(repeatedValue(a1));
        System.out.println(repeatedValue(a2));

        System.out.println(equal(a1, b1));
        System.out.println(equal(a1, a2));

        System.out.println(mostFrequent(a3));
    }
}