package JavaCore;

/**
 * 3.4.8
 *
 * Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() сравнивал
 * экземпляры ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным с реализацией equals().
 *
 * Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
 *
 * Пример
 *
 * ComplexNumber a = new ComplexNumber(1, 1);
 * ComplexNumber b = new ComplexNumber(1, 1);
 * // a.equals(b) must return true
 * // a.hashCode() must be equal to b.hashCode()
 * Подсказка 1. Поищите в классе java.lang.Double статический метод, который поможет в решении задачи.
 * Подсказка 2. Если задача никак не решается, можно позвать на помощь среду разработки, которая умеет сама
 * генерировать equals() и hashCode(). Если вы воспользовались помощью IDE, то разберитесь, что было сгенерировано
 * и почему оно выглядит именно так. Когда вас на собеседовании попросят на бумажке реализовать equals() и hashCode()
 * для какого-нибудь простого класса, то среда разработки помочь не сможет.
 *
 */

public class ComplexNumber_3_4_8 {
    public static void main(String[] args) {

    }
    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

    }

}
