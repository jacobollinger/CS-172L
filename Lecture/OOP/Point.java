class Point{
    // instance variables
    private double x;
    private double y;
    private double z;

    // constructor
    public Point(double x, double y, double z){
        // this allows you not to have to think of new variables
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Find distance between this point and another point
    public double distance(Point p){
        // this is optional here
        double diffx = (this.x - p.x) * (this.x - p.x);
        double diffy = (this.y - p.y) * (this.y - p.y);
        double diffz = (this.z - p.z) * (this.z - p.z);
        
        return Math.sqrt(diffx + diffy + diffz);
    }

    public String toString(){
        // this is optional here
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}