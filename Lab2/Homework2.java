class Homework2{
    
    static void printSequenceA(int n){
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.println("1");
            }else{
                System.out.println("-1");
            }
        }
    }

    static void printSequenceB(int n){
        int t = 1;
        for(int i = 0; i < n - n % 2; i += 2){
            System.out.println(t);
            System.out.println(t);
            t++;
        }
        if(n % 2 != 0){
            System.out.println(t);
        }
    }

    static void printSequenceC(int n){
        for(int i = 1; i <= (2 * n) / 3; i++){
            if(i % 2 != 0){
                System.out.println(i);
                System.out.println(i);
            }else{
                System.out.println(i);
            }   
        }
    }

    public static void main(String[] args){
        int n;

        n = 9;
        System.out.println("n=" + n);

        System.out.println("Sequence A");
        printSequenceA(n);

        System.out.println("Sequence B");
        printSequenceB(n);

        System.out.println("Sequence C");
        printSequenceC(n);

        System.out.println();

        n = 12;
        System.out.println("n=" + n);

        System.out.println("Sequence A");
        printSequenceA(n);

        System.out.println("Sequence B");
        printSequenceB(n);

        System.out.println("Sequence C");
        printSequenceC(n);
    }
}