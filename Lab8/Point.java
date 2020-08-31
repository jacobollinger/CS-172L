class Point{

    private double x;
    private double y;

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

    // Question 1 (solved)
    // Determine if two points p1 and p2 are equidistant from this point.
    public boolean equidistant(Point p1, Point p2){
        return this.distance(p1) == this.distance(p2);
    }

    // Question 2
    // Find the distance from this point to a line specified by two points p1 and p2.
    // Use the formula from http://mathworld.wolfram.com/Point-LineDistance2-Dimensional.html (equation 14).
    public double distanceToLine(Point p1, Point p2){
        return (Math.abs((p2.x - p1.x) * (p1.y - this.y) - (p1.x - this.x) * (p2.y - p1.y)) / Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2)));
    }

    // Question 3
    // Determine if all points in an array of points pointArr are within a radius r of this point,
    // i.e. the distance between this point and the points in pointArr does not exceed r.
    public boolean neighbor(Point[] pointArr, double r){
        for(int i = 0; i < pointArr.length; i++){
            double b = this.distance(pointArr[i]);
            if(this.distance(pointArr[i]) > r){
                return false;
            }
        }
        return true;
    }

    // Question 4
    // Find the point in an array of points pointArr that is the nearest to this point.
    public Point nearest(Point[] pointArr){
        int ndx = 0;
        for(int i = 1; i < pointArr.length; i++){
            if(this.distance(pointArr[i]) < this.distance(pointArr[ndx])){
                ndx = i;
            }
        }
        return pointArr[ndx];
    }

    // Question 5
    // Determine if this point is equidistant to any two distinct points in an array of points pointArr.
    public boolean equidistant(Point[] pointArr){
        for(int i = 0; i < pointArr.length; i++){
            double iDis = this.distance(pointArr[i]);
            for(int j = i + 1; j < pointArr.length; j++){
                double jDis = this.distance(pointArr[j]);
                if(iDis == jDis){
                    return true;
                }
            }
        }
        return false;
    }
}