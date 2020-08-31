import java.util.Arrays;

class Lab3{

    static int[] append(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            c[i + a.length] = b[i];
        }
        return c;
    }

    static int[] spread(int[] a){
        int[] c = new int[a.length * 2 - 1];
        for(int i = 0; i < c.length; i += 2){
            c[i] = a[i/2];
        }
        return c;
    }

    static int[] spread(int[] a, int k){
        int[] c = new int[a.length * (k + 1) - k];
        for(int i = 0; i < c.length; i += (k + 1)){
            c[i] = a[i/(k + 1)];
        }
        return c;
    }

    /**static int[] mix(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        for(int i = 0; i < c.length; i++){
            if(i % 2 == 0){
                c[i] = a[i / 2];
            }else{
                if(i / 2 < b.length){
                    c[i] = b[i / 2];
                }else{
                    c[i] = a[i / 2 + 1];
                }
            }
        }
        return c;
    }**/
    
    static int[] mix(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        for(int i = 0; i < a.length -1; i++){
            if(a.length > b.length){
                for(int j = 0; j < b.length; j++){
                    c[j * 2] = a[j];
                    i += 2;
                }
                // for(){
                //     c[i] = a[i / 2];
                // }
            }
        }
        return c;
    }

    static int[] reverse(int[] a){
        int temp;
        for(int i = 0; i < a.length / 2; i++){
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        return a;
    }

    static int[] shiftZeros(int[] a){
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] == 0){
                for(int j = 1; i < a.length - j; j++){
                    if(a[i + j] != 0){
                        a[i] = a[i + j];
                        a[i + j] = 0;
                        break;
                    }   
                }
            }
        }
        return a;
    }

    public static void main(String[] args){
        int[] a1 = {1, 3, 5, 7, 8, 9};
        int[] b2 = {2, 4, 6};

        System.out.println(Arrays.toString(mix(a1, b2)));
    }
}