class Test{
    public static void main(String[] args){
        // Q2
        Scientist s1 = new Scientist("Feynman", 1918, "physics");
        Scientist s2 = new Scientist("Mendel", 1918, "biology");
        Scientist s3 = new Scientist("Einstein", 1918, "physics");

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));

        Scientist[] a = {s1, s2, s3};

        
    }
}