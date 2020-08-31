class Triangle{
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double perimeter(){
        // this is optional here
        double a = this.p1.distance(this.p2);
        double b = this.p2.distance(this.p3);
        double c = this.p3.distance(this.p1);

        return a + b + c;
    }

    public String toString(){
        return "{" + p1 + ", " + p2 + ", " + p3 + "}";
    }
}