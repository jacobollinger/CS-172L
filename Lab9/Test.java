class Test{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(new Point(2, 1), 3, 2);
        Rectangle r2 = new Rectangle(new Point(3, 2), 1, 0.5);
        Rectangle r3 = new Rectangle(new Point(3, 2), 1, 2);
        Rectangle r4 = new Rectangle(new Point(1, 0), 2, 2);
        Rectangle r5 = new Rectangle(new Point(0, 0), 1, 1);
        Rectangle r6 = new Rectangle(new Point(4, 4), 3, 2);
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 2);
        Point p3 = new Point(4, 2);
        Point p4 = new Point(3, 4);
        Point p5 = new Point(4, 4);
        Point[] a = {p2, p3};
        Point[] b = {p2, p1, p3};
        System.out.println("question 1.");
        System.out.println(r1.compareTo(r2));
        System.out.println(r1.compareTo(r1));
        System.out.println(r2.compareTo(r1));
        System.out.println();
        System.out.println("question 2.");
        System.out.println(r1.contains(p2) + " " + r1.contains(p4));
        System.out.println();
        System.out.println("question 3.");
        System.out.println(r1.contains(r2) + " " + r1.contains(r3));
        System.out.println();
        System.out.println("question 4.");
        System.out.println(r1.contains(a) + " " + r1.contains(b));
        System.out.println();
        System.out.println("question 5.");
        System.out.println(r4.intersects(r1) + " " + r1.intersects(r4) + " " + r1.intersects(r3) + " " + r3.intersects(r1));
        System.out.println(r5.intersects(r1) + " " + r1.intersects(r5) + " " + r1.intersects(r2) + " " + r2.intersects(r1) + " " + r1.intersects(r6) + " " + r6.intersects(r1));
    }
}

// expected output:

// question 1.
// 1
// 0
// -1

// question 2.
// true false

// question 3.
// true false

// question 4.
// true false

// question 5.
// true true true true
// false false false false false false