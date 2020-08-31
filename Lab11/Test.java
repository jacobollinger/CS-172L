class Test{
    public static void main(String[] args){
        Polynomial p1 = new Polynomial(new int[]{-1, -29, 1, 12});
        Polynomial p2 = new Polynomial(new int[]{-1, -29, 1, 12});
        Polynomial p3 = new Polynomial(new int[]{-1, 0, -88, 12});
        Polynomial p4 = new Polynomial(new int[]{1, -1, 2});
        Polynomial p5 = new Polynomial(new int[]{-41, 76});
        Polynomial p6 = new Polynomial(new int[]{1, 1, 2});
        Polynomial p7 = new Polynomial(new int[]{-41, 76, 1});
        Polynomial p8 = new Polynomial(new int[]{0, 0, -1});
        Polynomial p9 = new Polynomial(new int[]{0, -29, 1, 12});
        Polynomial p10 = new Polynomial(new int[]{76});

        System.out.println("question 1.");
        System.out.println("p1 equals p2? " + p1.equals(p2));
        System.out.println("p1 equals p3? " + p1.equals(p3));
        System.out.println("p1 equals p4? " + p1.equals(p4));
        System.out.println("p1 equals p5? " + p1.equals(p5));
        System.out.println("p4 equals p6? " + p4.equals(p6));
        System.out.println("p5 equals p7? " + p5.equals(p7));
        System.out.println("p5 equals p10? " + p5.equals(p10));
        System.out.println();

        System.out.println("question 2.");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p4: " + p4);
        System.out.println("p5: " + p5);
        System.out.println("p6: " + p6);
        System.out.println("p7: " + p7);
        System.out.println("p8: " + p8);
        System.out.println("p9: " + p9);
        System.out.println("p10: " + p10);
        System.out.println();

        System.out.println("question 3.");
        System.out.println("compare p1 to p2: " + p1.compareTo(p2));
        System.out.println("compare p1 to p3: " + p1.compareTo(p3));
        System.out.println("compare p1 to p7: " + p1.compareTo(p7));
        System.out.println("compare p1 to p9: " + p1.compareTo(p9));
        System.out.println("compare p5 to p6: " + p5.compareTo(p6));
        System.out.println("compare p5 to p7: " + p5.compareTo(p7));
        System.out.println("compare p5 to p8: " + p5.compareTo(p8));
        System.out.println();

        System.out.println("question 4.");
        System.out.println("p1 + p2 = " + p1.add(p2));
        System.out.println("p2 + p3 = " + p2.add(p3));
        System.out.println("p3 + p4 = " + p3.add(p4));
        System.out.println("p4 + p5 = " + p4.add(p5));
        System.out.println("p5 + p6 = " + p5.add(p6));
        System.out.println("p6 + p7 = " + p6.add(p7));
        System.out.println("p7 + p8 = " + p7.add(p8));
        System.out.println();
    }
}

// output:

// question 1.
// p1 equals p2? true
// p1 equals p3? false
// p1 equals p4? false
// p1 equals p5? false
// p4 equals p6? false
// p5 equals p7? false
// p5 equals p10? false

// question 2.
// p1: 12x^3+x^2-29x-1
// p2: 12x^3+x^2-29x-1
// p3: 12x^3-88x^2-1
// p4: 2x^2-x+1
// p5: 76x-41
// p6: 2x^2+x+1
// p7: x^2+76x-41
// p8: -x^2
// p9: 12x^3+x^2-29x
// p10: 76

// question 3.
// compare p1 to p2: 0
// compare p1 to p3: 89
// compare p1 to p7: 12
// compare p1 to p9: -1
// compare p5 to p6: -2
// compare p5 to p7: -1
// compare p5 to p8: 1

// question 4.
// p1 + p2 = 24x^3+2x^2-58x-2
// p2 + p3 = 24x^3-87x^2-29x-2
// p3 + p4 = 12x^3-86x^2-x
// p4 + p5 = 2x^2+75x-40
// p5 + p6 = 2x^2+77x-40
// p6 + p7 = 3x^2+77x-40
// p7 + p8 = 76x-41