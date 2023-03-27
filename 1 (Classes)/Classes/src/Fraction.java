public class Fraction {
    private int numerator;
    private int denominator;
    //constructor
    public Fraction (int num, int den){
        numerator = num;
        denominator = den;
    }

    //mutators
    private void reduce () {
        for (int i = Math.min(numerator, denominator); i > 0; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator = numerator / i;
                denominator = denominator / i;
            }
        }
    }
    public void add (Fraction other) {
        //find common denominator by multiplying both sides;
        int temp = denominator;
        denominator = denominator * other.getDen();
        numerator = numerator * other.getDen() + other.getNum() * temp;
        reduce();
    }
    public void subtract (Fraction other) {
        //find common denominator by multiplying both sides;
        int temp = denominator;
        denominator = denominator * other.getDen();
        numerator = numerator * other.getDen() - other.getNum() * temp;
        reduce();
    }
    public void reciprocal () {
        int temp = denominator;
        denominator = numerator;
        numerator = temp;
    }
    public double value(){
        return 1.0 * numerator / denominator;
    }
    public String toString(){
        return Integer.toString(numerator) + "/" + Integer.toString(denominator);
    }
    public String toMixed(){
        int lead = numerator / denominator;
        int remainder = numerator % denominator;
        return Integer.toString(lead) + " " + Integer.toString(remainder) + "/" + Integer.toString(denominator);
    }
    public void multiply (Fraction other) {
        denominator = denominator * other.denominator;
        numerator = numerator * other.numerator;
        reduce();
    }
    public void divide (Fraction other) {
        other.reciprocal();
        denominator = denominator * other.denominator;
        numerator = numerator * other.numerator;
        reduce();
    }

    //accessors (methods to return num/den)
    public int getNum () {
        return numerator;
    }
    public int getDen () {
        return denominator;
    }
    public boolean equal(Fraction other) {
        return (value() == other.value());
    }
    public boolean greaterThan(Fraction other) {
        return (value() > other.value());
    }
    public boolean lessThan(Fraction other) {
        return (value() < other.value());
    }
}
