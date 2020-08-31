class Rectangle {
    private Point bottomLeft;
    private double width;
    private double height;

    public Rectangle(Point bottomLeft, double width, double height)
    {
        this.bottomLeft = bottomLeft;
        this.width = width;
        this.height = height;
    }

    // Returns true if a point p is strictly inside this rectangle.
    // Returns false otherwise.
    public boolean contains(Point p)
    {
        return bottomLeft.x < p.x && p.x < bottomLeft.x + width && bottomLeft.y < p.y && p.y < bottomLeft.y + height;
    }

    public boolean contains(Rectangle r)
    {
        return this.contains(r.bottomLeft) && this.bottomLeft.x + this.width > r.bottomLeft.x + r.width && this.bottomLeft.y + this.height > r.bottomLeft.y + r.height;
    }
}