class Test{
    public static void main(String[] args){
        // objects of the class point
        Point p1 = new Point(-1, 0, 3);
        Point p2 = new Point(2, 1, -3);

        System.out.println(p1.distance(p2));

        // Both do the same
        // toString is optional
        System.out.println(p1.toString());
        System.out.println(p1);

        Point p3 = new Point(0, 0, 3);
        Triangle t = new Triangle(p1, p2, p3);
        System.out.println(t.perimeter());
        System.out.println(t);
    }
}