package JavaCore;

/**
 * 3.3.12
 * <p>
 * Создайте класс Human с полями возраст (age), имя (name), фамилия (secondName) и любимый вид спорта (favoriteSport).
 * <p>
 * Создайте 3 конструктора в классе Human, 1-ый - пустой, 2-ой, который конструирует Human’a от всех полей и третий,
 * который конструирует Human’a, от всех полей, кроме любимого вида спорта. Для успешного тестирования решения важно
 * объявлять аргументы в конструкторах именно в том порядке, в котором они написаны в данном описании (возраст (age),
 * имя (name), фамилия (secondName) и любимый вид спорта (favoriteSport))
 * <p>
 * В методе main создайте 3 экземпляра человека используя 3 этих разных конструктора. поля класса должны иметь
 * размерность, не превышающую необходимую. Класс должен быть объявлен статическим, метод main не должен находиться
 * в классе, поля класса должны иметь доступ только внутри класса
 */

public class Human_3_3_12 {

    public static void main(String[] args) {

        Human petya = new Human();
        Human vasya = new Human((byte)25, "Vasya", "Petrov", "Football");
        Human vova = new Human((byte)22, "Vova", "Pupkin");

    }

    public static class Human {

        private static byte age;
        private static String name;
        private static String secondName;
        private static String favoriteSport;

        public Human() {

        }

        public Human(byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }

        public Human(byte age, String name, String secondName, String favoriteSport) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
            this.favoriteSport = favoriteSport;
        }
    }
}
