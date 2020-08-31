class Test{
    public static void main(String[] args){
        
        Point p1 = new Point(3, 1);
        Point p2 = new Point(1, 9);
        Point a = new Point(2, -1);
        Point b = new Point(4, -1);
        Point c = new Point(1, 1);
        Point d = new Point(4, 3);
        Point e = new Point(3, 3);
        Point f = new Point(0, 0);
        Point g = new Point(2, 9);
        Point h = new Point(0, 9);
        Point[] P = {a, b, c, d, e, f};
        Point[] Q = {e, d, f, g, h};

        System.out.println("\nquestion 1:");
        System.out.println(p1.equidistant(a, b));
        System.out.println(p1.equidistant(b, c));

        System.out.println("\nquestion 2:");
        System.out.println(p1.distanceToLine(a, b));
        System.out.println(p1.distanceToLine(b, c));

        System.out.println("\nquestion 3:");
        System.out.println(p1.neighbor(P, 4));
        System.out.println(p1.neighbor(Q, 9));
        System.out.println(p1.neighbor(P, 3));
        System.out.println(p1.neighbor(Q, 8));

        System.out.println("\nquestion 4:");
        System.out.println(p1.nearest(P));
        System.out.println(p1.nearest(Q));
        System.out.println(p2.nearest(P));
        System.out.println(p2.nearest(Q));

        System.out.println("\nquestion 5:");
        System.out.println(p1.equidistant(P));
        System.out.println(p2.equidistant(Q));
        System.out.println(p1.equidistant(Q));
        System.out.println(p2.equidistant(P));
    }
}

// Expected output:

// question 1:
// true
// false

// question 2:
// 2.0
// 1.1094003924504583

// question 3:
// true
// true
// false
// false

// question 4:
// (1.0, 1.0)
// (3.0, 3.0)
// (3.0, 3.0)
// (2.0, 9.0)

// question 5:
// true
// true
// false
// false