public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();

        System.out.println(calc.sum(5, 2));
        System.out.println(calc.mult(10, 2));
        System.out.println(calc.pow(4, 2));
    }
}
