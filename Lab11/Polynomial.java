class Polynomial implements Comparable<Polynomial>{
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

    public double evaluate(double x){
        double value = 0;
        for(int i = 0; i < coefficient.length; i++){
            value = value + coefficient[i] * Math.pow(x, i);
        }
        return value;
    }

    // questions 1.
    public boolean equals(Object obj){
        Polynomial p = (Polynomial) obj; // Do not remove or modify this line.
        if(this.coefficient.length == p.coefficient.length){
            for(int i = 0; i < this.coefficient.length; i++){
                if(this.coefficient[i] != p.coefficient[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // question 2.
    public String toString(){
        String s = "";
        String sign;
        String coefficient = "";
        String degree;
        for(int i = this.degree(); i >= 0; i--){
            if(this.coefficient[i] != 0){
                sign = this.coefficient[i] > 0 ? "+" : "-";
                degree = i > 1 ? "x" + "^" + i : i == 1 ? "x" : "";
                // if(this.coefficient[i] > 0){
                //     sign = "+";
                // }else{
                //     sign = "-";
                // }
                // if(i > 1){
                //     degree = "x" + "^" + i;
                // }else if(i == 1){
                //     degree = "x";
                // }else{
                //     degree = "";
                // }
                if(this.coefficient[i] != 0 || degree == ""){
                    coefficient = "" + Math.abs(this.coefficient[i]);
                }

                if(s == ""){
                    if(this.coefficient[i] > 0){
                        sign = "";
                    }
                    s = sign + coefficient + degree;
                }else{
                    s = s + " " + sign + " " + coefficient + degree;
                }
            } 
        }
        return s;
    }

    // question 3.
    public int compareTo(Polynomial p){
        if(this.degree() == p.degree()){
            for(int i = this.degree(); i >= 0; i--){
                int diff = this.coefficient[i] - p.coefficient[i];
                if(diff != 0){
                    return diff;
                }
            }
            return 0;
        }else{
            return this.degree() > p.degree() ? this.coefficient[this.degree()] : -p.coefficient[p.degree()];
        }
    }

    // question 4.
    public Polynomial add(Polynomial p){
        Polynomial pG = new Polynomial(this.degree() > p.degree() ? this.coefficient : p.coefficient);
        Polynomial pS = this.degree() > p.degree() ? p : this;
        for(int i = 0; i <= pS.degree(); i++){
            pG.coefficient[i] += pS.coefficient[i];
        }
        return pG;
    }
}