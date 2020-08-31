// Class that implements an axis-aligned rectangle.
// The statement implements Comparable<Rectangle> indicates that
// rectangle objects can be compared, and that the class Rectangle has a function compareTo.

class Rectangle implements Comparable<Rectangle>{
    private Point bottomLeft;
    private Point topLeft;
    private Point topRight;
    private Point bottomRight;

    public Rectangle(Point bottomLeft, double width, double height){
        this.bottomLeft = bottomLeft;
        this.topLeft = new Point(bottomLeft.x, bottomLeft.y + height);
        this.topRight = new Point(bottomLeft.x + width, bottomLeft.y + height);
        this.bottomRight = new Point(bottomLeft.x + width, bottomLeft.y);
    }

    public String toString(){
        return "{" + bottomLeft + ", " + topLeft + ", " + topRight + ", " + bottomRight + "}";
    }

    // Returns the area of this rectangle.
    public double area(){
        return (bottomRight.x - bottomLeft.x) * (topLeft.y - bottomLeft.y);
    }

    // question 1.
    // Compares the area of this rectangle to the area of a rectangle r, and returns
        // -1 if this rectangle is smaller than r.
        // 0 if this and r have the same area.
        // +1 if this rectangle is larger than r.
    public int compareTo(Rectangle r){
        double area1 = this.area();
        double area2 = r.area();
        if(area1 < area2){
            return -1;
        }else if(area1 > area2){
            return 1;
        }
        return 0;
    }

    // question 2.
    // Returns true if a point p is strictly inside this rectangle.
    // Returns false otherwise.
    public boolean contains(Point p){
        if(bottomLeft.x < p.x && p.x < bottomRight.x && bottomLeft.y < p.y && p.y < topLeft.y){
            return true;
        }
        return false;
    }

    // question 3.
    // Returns true if a rectangle r is strictly inside this rectangle.
    // Returns false otherwise.
    public boolean contains(Rectangle r){
        if(this.contains(r.bottomLeft) && this.contains(r.bottomRight) && this.contains(r.topLeft) && this.contains(r.topRight)){
            return true;
        }
        return false;
    }

    // question 4.
    // Returns true if all the points in the array pointArr are strictly inside this rectangle.
    // Returns false otherwise.
    public boolean contains(Point[] pointArr){
        for(int i = 0; i < pointArr.length; i++){
            if(!this.contains(pointArr[i])){
                return false;
            }
        }
        return true;
    }

    // question 5.
    // Returns true if this rectangle intersects a rectangle r.
    // Returns false otherwise.
    // Two rectangles intersect if they have at least a common point.
    // The image intersection.png shows examples of rectangles that intersect.
    public boolean intersects(Rectangle r){
        if(this.bottomLeft.x > r.bottomRight.x || r.bottomLeft.x > this.bottomRight.x || this.bottomLeft.y > r.topLeft.y || r.bottomLeft.y > this.topLeft.y || this.contains(r) || r.contains(this)){
            return false;
        }
        return true;
    }
}