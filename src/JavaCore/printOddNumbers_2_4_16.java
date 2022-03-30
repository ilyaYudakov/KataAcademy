package JavaCore;

/**
 * 2.4.16
 *
 * Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.
 *
 * Пример ввода: [3,5,20,8,7,3,100]
 *
 * Пример вывода: 3,5,7,3
 *
 * Требования:
 * Сигнатура метода должна быть: printOddNumbers(int[] arr)
 */

public class printOddNumbers_2_4_16 {

    public static void main(String[] args) {

        int[] arr = {3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int i : arr) {
            if (i % 2 != 0) {
                if (first) {
                    sb.append(i);
                    first = false;
                } else {
                    sb.append(",").append(i);
                }
            }
        }
        System.out.println(sb);
    }
}