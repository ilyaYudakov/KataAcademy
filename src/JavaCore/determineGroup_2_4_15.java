package JavaCore;

/**
 * determineGroup_2_4_15
 *
 * В спортивном центре есть три возрастные группы для занятий волейболом 1 - от 7 до 13 лет 2 - от 14 до 17 лет 3 - от 18 до 65 лет.
 *
 * Напишите публичный нестатичный метод determineGroup который принимает возраст человека и возвращает целое число, которое обозначает номер группы в которую его надо определить, если подходящей группы нет - верните -1.
 *
 * Пример ввода: 10
 * Пример вывода: 1
 *
 * Пример ввода: 60
 * Пример вывода: 3
 *
 * Пример ввода: 77
 * Пример вывода: -1
 * Требования:
 * Сигнатура метода должна быть: determineGroup(int age)
 * Метод должен возвращать int
 * Метод не должен быть статическим
 */

public class determineGroup_2_4_15 {

    public static void main(String[] args) {
        System.out.println(determineGroup(10));
        System.out.println(determineGroup(60));
        System.out.println(determineGroup(77));
    }

    public static int determineGroup(int age) {
        //Твой код здесь
        return age >= 7 && age < 14 ? 1 : age < 17 ? 2 : age < 66 ? 3 : -1;
//
//        if (age >= 7 && age <= 13) {
//            return 1;
//        } else if (age >= 14 && age < 18) {
//            return 2;
//        } else if (age >= 18 && age < 66) {
//            return 3;
//        }
//        return -1;
    }

}