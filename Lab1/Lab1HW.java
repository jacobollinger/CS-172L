
class Lab1HW{
    
    // Max of two numbers with if/else.
    static int maxie(int a, int b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }
    
    // Max of three numbers.
    static int maxie(int a, int b, int c){
        if (a > b && a > c){
            return a;
        }else if(a < b && b > c){
            return b;
        }else{
            return c;
        }
    }
    
    // Returns the letter grade of a percentage
    static char grade(double p){
        if (p > 90){
            return 'A';
        }else if (p > 80){
            return 'B';
        }else if (p > 70){
            return 'C';
        }else if (p > 60){
            return 'D';
        }else{
            return 'F';
        }
    }
    
    public static void main(String[] args){
        
        // Homework outputs
        System.out.println("Max of 5 and 8: " + maxie(5, 8));
        
        System.out.println("Max of 5, 8, and 12: " + maxie(5, 8, 12));
        
        System.out.println("An average of 80.1% recieves a letter grade: " + grade(80.1));
    }
}