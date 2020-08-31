class Point{

    public final double x;
    public final double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    // Euclidean distance between this point and a point p.
    public double distance(Point p){
        double diffX = (this.x - p.x) * (this.x - p.x);
        double diffY = (this.y - p.y) * (this.y - p.y);
        return Math.sqrt(diffX + diffY);
    }

    // String representation of this point.
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}