class Lect22{
    // Object-oriented programming
    public static void main(String[] args){
        // 3-D triangle
        double[][] t = {{1, 0, -1}, {-2, 1, -2}, {0, 2, 2}};
        /**
         * x-values of p1: t[0][0]
         * y-values of p3: t[2][1]
         */

        // For Object-oriented use individual classes for point and triangle
    }
}

class Point {
    double x;
    double y;
    double z;

    double distance(Point p){

    }
}

class Triangle {
    Point p1;
    Point p2;
    Point p3;
    /** Triangle t
     * x-value of p1: t.p1.x
     * y-value of p3: t.p3.y
     */

    double perimeter(){
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }
}