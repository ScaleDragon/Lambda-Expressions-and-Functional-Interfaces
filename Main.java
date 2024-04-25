package HomeWork.Lambda_Expressions_and_Functional_Interfaces.Calculator;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
//        int c = 0;

//        try {
        int c = calc.devide.apply(a, b);
//        } catch (ArithmeticException e) {
//            System.out.println("На ноль делить нельзя");
//        }

        // TODO : Причина возникновения ошибки: на 0 делить нельзя,
        // TODO : так как ArithmeticException наследуется от RuntimeException, то ошибка выходит
        // TODO : во время выполнения программы. Runtime исключения бывают в коде, в котором присутствуют
        // TODO : ошибочные выражения. Компилятор не в состоянии проверить возможность выброса Runtime исключений.
        // TODO : Способы решения: 1. Проверка в условии if(c!=0);
        // TODO : Способы решения: 2. Обработка исключения при помощи конструкции try-catch;

        calc.println.accept(c);

    }
}
