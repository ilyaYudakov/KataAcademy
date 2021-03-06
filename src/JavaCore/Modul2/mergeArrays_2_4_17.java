package JavaCore.Modul2;

import java.util.Arrays;

/**
 *2.4.17
 *
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.
 *
 * Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
 *
 * К сожалению, автоматически это не проверить, так что это остается на вашей совести :)
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 *
 * Пример ввода: {0, 2, 2} и {1, 3}
 * Пример вывода: {0, 1, 2, 2, 3}
 */

public class mergeArrays_2_4_17 {
    public static void main(String[] args) {

        int[] arr1 = {0, 2, 2};
        int[] arr2 = {1, 3};

        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));


    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] sumArrays = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {
            sumArrays[k++] = a1[i] < a2[j] ? a1[i++] : a2[j++];
        }
        while (i < a1.length) {
            sumArrays[k++] = a1[i++];
        }
        while (j < a2.length) {
            sumArrays[k++] = a2[j++];
        }
        return sumArrays;
    }
}
