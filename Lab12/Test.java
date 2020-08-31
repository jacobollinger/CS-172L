class Test{
    public static void main(String[] args){
        QuadraticPolynomial p1 = new QuadraticPolynomial(2, -1, 1);
        QuadraticPolynomial p2 = new QuadraticPolynomial(-1, 76, -41);
        QuadraticPolynomial p3 = new QuadraticPolynomial(1, 0, -2);
        Polynomial p4 = new Polynomial(new int[]{4, 0, -5, 1});

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p4: " + p4);
        System.out.println();

        System.out.println("vertex of p1: " + p1.vertex());
        System.out.println("vertex of p2: " + p2.vertex());
        System.out.println("vertex of p3: " + p3.vertex());
        System.out.println();

        System.out.println("roots of p1: " + java.util.Arrays.toString(p1.roots()));
        System.out.println("roots of p2: " + java.util.Arrays.toString(p2.roots()));
        System.out.println("roots of p3: " + java.util.Arrays.toString(p3.roots()));
        System.out.println();

        System.out.println("p1 + p2 = " + p1.add(p2));
        System.out.println("p2 + p3 = " + p2.add(p3));
        System.out.println("p3 + p1 = " + p3.add(p1));
        System.out.println("p1 + p4 = " + p1.add(p4));
    }
}

// output:
// p1: 2x^2-x+1
// p2: -x^2+76x-41
// p3: x^2-2
// p4: x^3-5x^2+4

// vertex of p1: (0.25, 0.875)
// vertex of p2: (38.0, 1403.0)
// vertex of p3: (0.0, -2.0)

// roots of p1: []
// roots of p2: [0.5433583993439157, 75.45664160065608]
// roots of p3: [1.4142135623730951, -1.4142135623730951]

// p1 + p2 = x^2+75x-40
// p2 + p3 = null
// p3 + p1 = 3x^2-x-1
// p1 + p4 = null