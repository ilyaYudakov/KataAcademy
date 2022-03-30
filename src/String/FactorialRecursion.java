package String;

import java.math.BigInteger;

public class FactorialRecursion {

    /**
     * 2.4.13
     * <p>
     * Реализуйте метод factorial, вычисляющий факториал заданного натурального числа
     * Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N.
     * Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
     * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
     * <p>
     * Пример ввода 1: 1
     * Пример возвращаемого значения 1: 1
     * Пример ввода 2: 3
     * Пример возвращаемого значения 2: 6
     * <p>
     * Требования:
     * 1. Метод должен быть public.
     * 1. Метод должен быть static.
     * 3. Передаваемый параметр должен иметь тип int.
     * 4. Метод должен быть реализован через цикл.
     */

    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {
        //Твой код здесь

        return value == 1 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial(value - 1));
    }
}

