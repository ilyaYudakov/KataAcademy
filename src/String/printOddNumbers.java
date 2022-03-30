package String;

/**
 * 2.4.16
 * <p>
 * Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.
 * <p>
 * Пример ввода: [3,5,20,8,7,3,100]
 * <p>
 * Пример вывода: 3,5,7,3
 * <p>
 * <p>
 * <p>
 * Требования:
 * Сигнатура метода должна быть: printOddNumbers(int[] arr)
 */

public class printOddNumbers {

    public static void main(String[] args) {

        int[] arr = {3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 != 0) {
                if (first) {
                    sb.append(arr[x]);
                    first = false;
                } else {
                    sb.append("," + arr[x]);
                }
            }
        }
        System.out.println(sb);
    }
}