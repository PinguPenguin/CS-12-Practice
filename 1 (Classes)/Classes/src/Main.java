public class Main {
    public static void main(String[] args) {
        Fraction frac = new Fraction(123, 120);
        Fraction brac = new Fraction(124, 120);
      //  frac.divide(brac);
       // String str = frac.toMixed();
        System.out.println(frac.value());
        System.out.println(brac.value());
        System.out.println(frac.greaterThan(brac));
        System.out.println(frac.lessThan(brac));
    }
}
