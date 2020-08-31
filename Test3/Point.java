class Point {
    public final double x;
    public final double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p)
    {
        double diffX = (this.x - p.x) * (this.x - p.x);
        double diffY = (this.y - p.y) * (this.y - p.y);
        return Math.sqrt(diffX + diffY);
    }
}