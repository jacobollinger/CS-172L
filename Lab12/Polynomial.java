class Polynomial{
    private final int[] coefficient;

    public Polynomial(int[] coefficient){
        this.coefficient = new int[coefficient.length];
        for(int i = 0; i < coefficient.length; i++){
            this.coefficient[i] = coefficient[i];
        }
    }

    public Polynomial(int degree){
        this.coefficient = new int[degree + 1];
        this.coefficient[degree] = 1;
    }

    public int degree(){
        return coefficient.length - 1;
    }

    // Get the value of coefficient[degree].
    public int getCoefficient(int degree){
        return this.coefficient[degree];
    }

    // Change the value of coefficient[degree].
    public void setCoefficient(int degree, int value){
        this.coefficient[degree] = value;
    }

    public double evaluate(double x){
        double value = 0;
        for(int i = 0; i < coefficient.length; i++){
            value = value + coefficient[i] * Math.pow(x, i);
        }
        return value;
    }

    public String toString(){
        String s = "";
        for(int i = this.degree(); i >= 0; i--){
            if(coefficient[i] != 0){
                if(i < coefficient.length - 1 && coefficient[i] > 0){
                    s = s + "+";
                }
                if(Math.abs(coefficient[i]) != 1 || i == 0){
                    s = s + coefficient[i];
                }
                else if(coefficient[i] == -1){
                    s = s + "-";
                }
                if(i > 0){
                    s = s + "x";
                }
                if(i > 1){
                    s = s + "^" + i;
                }
            }
        }
        return s;
    }

    public Polynomial add(Polynomial p){
        int d = Math.max(this.degree(), p.degree());
        while(d > 0 && d <= this.degree() && d <= p.degree() && this.coefficient[d] + p.coefficient[d] == 0){
            d--;
        }
        int[] coeffSum = new int[d + 1];
        for(int i = 0; i < coeffSum.length; i++){
            if(i < this.coefficient.length){
                coeffSum[i] = this.coefficient[i];
            }
            if(i < p.coefficient.length){
                coeffSum[i] = coeffSum[i] + p.coefficient[i];
            }
        }
        return new Polynomial(coeffSum);
    }
}