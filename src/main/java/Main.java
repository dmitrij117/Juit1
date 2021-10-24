public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // выскакивает ArithmeticException  - деление на 0,
        // поскольку результатом вычисления переменной b является 0.
        // Для решения проблемы мы можем обработать исключение ArithmeticException (реализован ниже)

        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Внимание!!! Деление на 0! На ноль делить нельзя");
        }

    }
}
