class Lab4HW{

    static boolean commonValue(int[] a, int[] b){
        int i = 0;
        int j = 0;
        
        while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                return true;
            }
            if(a[i] < b[j]){
                i++;
            }else if(a[i] > b[j]){
                j++;
            }
        }
        return false;
    }

    static int largestCommonValue(int[] a, int[] b){
        int i = a.length - 1;
        int j = b.length - 1;
        
        while(i >= 0 && j >= 0){
            if(a[i] == b[j]){
                return a[i];
            }
            if(a[i] > b[j]){
                i--;
            }else if(a[i] < b[j]){
                j--;
            }
        }
        return -1;
    }

    static boolean subsequence(int[] a, int[] b){
        if(a.length > b.length){
            return false;
        }

        int i = 0;
        int j = 0;
        
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                return false;
            }else if(a[i] > b[j]){
                j++;
            }else{
                i++;
                j++;
            }
        }
        return i >= a.length;
    }

    public static void main(String[] args){
        int[] a1 = {2, 4, 4, 7, 12, 13, 15, 17, 18};
        int[] a2 = {3, 5, 6, 8, 10};
        int[] b2 = {3, 3, 5, 6, 7, 8, 10};
        
        System.out.println(commonValue(a1, a2));

        System.out.println(largestCommonValue(b2, a2));

        System.out.println(subsequence(a2, b2));
    }
}