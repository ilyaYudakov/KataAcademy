package JavaCore.Modul3;

/**
 * 3.3.11
 *
 * Создайте класс Cat и класс Dog. В классе Cat должен быть метод sayHello(),
 * который выводит в консоль "Мяу!", аналогично с собакой, но выводит "Гав!".
 * Так же, у собаки должен быть метод catchCat (поймать кошку), который принимает
 * кошку и дальше делает следующее:
 *
 *
 * 1) выводит в консоль сообщение "Кошка поймана"
 * 2) У собаки, которая поймала кошку должен быть вызван метод sayHello()
 * 3) У кошки, которую поймала собака должен быть вызван метод sayHello()
 *
 */

public class DogCatchCat_3_3_11 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.catchCat(cat);


    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat catchCat) {
            System.out.println("Кошка поймана");
            sayHello();
            catchCat.sayHello();
        }
    }
}
