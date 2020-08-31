
class Lab1{
    
    // Max of two numbers. 
    static int max(int a, int b){
        return a > b ? a : b;
    }
    
    // Max of three numbers.
    static int max(int a, int b, int c){
        int m = a > b ? a : b;
        return m > c ? m : c;
    }
    
    // Finds the Euclidean distance between two points.
    static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
    
    // Approximate Pi.
    static double piApprox(){
        return 4 * (2 * Math.atan(1.0 / 3) + Math.atan(1.0 / 7));
    }
    
    // Finds the nth Fibonacci number using Binet’s formula.
    static double fibonacci(int n){
        //return ((Math.pow((1 + Math.sqrt(5)), n) - Math.pow((1 - Math.sqrt(5)), n)) / (Math.pow(2, n) * Math.sqrt(5)));
        double sf = Math.sqrt(5);
        return ((Math.pow((1 + sf), n) - Math.pow((1 - sf), n)) / (Math.pow(2, n) * sf);
    }
    
    // Rounds a variable.
    static int round(double a){
        return (int)(a + 0.5);
    }
    
    public static void main(String[] args){
        
        // Lab1 Outputs
        System.out.println("Max of 5 and 8: " + max(5, 8));
        
        System.out.println("Max of 5, 8, and 12: " + max(5, 8, 12));
        
        System.out.println("Distance betweem the points (2, 1) and (5, 20): " + distance(2, 1, 5, 20));
        
        System.out.println("Approximation of Pi with Hutton's formula: " + piApprox());
        
        System.out.println("The 8th number in the Fibonacci sequence is: " + (int)fibonacci(8));
        
        System.out.println("7.4 rounds to: " + round(7.4));
    }
}