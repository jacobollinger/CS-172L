class QuadraticPolynomial extends Polynomial{
    private int a;
    private int b;
    private int c;

    public QuadraticPolynomial(int a, int b, int c){
        // Call the constructor of Polynomial, and creates a polynomial of degree 2.
        super(2);

        // Place the values a, b, and c in the array coefficient of the class Polynomial.
        // The function setCoefficient is needed because the array coefficient is private.
        setCoefficient(2, a);
        setCoefficient(1, b);
        setCoefficient(0, c);

        // Initialize the instance variables of this class.
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // question 1.
    public Point vertex(){
        // x = -b/2a
        // y = f(x)
        double x = (double) -this.b / (2 * this.a);
        Point p = new Point(x, evaluate(x));
        return p;
    }

    // question 2.
    public double[] roots(){
        double test = this.b * this.b - 4 * this.a * this.c;
        if(test > 0){
            double[] r = {(-this.b + Math.sqrt(test)) / (2 * this.a), (-this.b - Math.sqrt(test)) / (2 * this.a)};
            return r;
        }else if(test == 0){
            double[] r = {(-this.b + Math.sqrt(test)) / (2 * this.a)};
            return r;
        }
        return new double[0];
    }

    // question 3.
    public QuadraticPolynomial add(Polynomial p){
        Polynomial pSum = super.add(p);
        if(pSum.degree() != 2){
            return null;
        }else{
            return new QuadraticPolynomial(pSum.getCoefficient(2), pSum.getCoefficient(1), pSum.getCoefficient(0));
        }
    }
}