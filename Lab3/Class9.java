class Class9{

    static int maximum(int[] a){
        int m = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > m){
                m = a[i];
            }
        }
        return m;
    }

    public static void main(String[] args){
        int[] n = {12, 35, 29, 20, 37, 163};
        maximum(n);
    }
}