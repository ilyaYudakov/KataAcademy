package JavaCore;

/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y - снизу вверх. (Помните, как рисовали графики функций в школе?)
 * <p>
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх,
 * вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 * <p>
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 * <p>
 * public class Robot {
 * <p>
 * public Direction getDirection() {
 * // текущее направление взгляда
 * }
 * <p>
 * public int getX() {
 * // текущая координата X
 * }
 * <p>
 * public int getY() {
 * // текущая координата Y
 * }
 * <p>
 * public void turnLeft() {
 * // повернуться на 90 градусов против часовой стрелки
 * }
 * <p>
 * public void turnRight() {
 * // повернуться на 90 градусов по часовой стрелке
 * }
 * <p>
 * public void stepForward() {
 * // шаг в направлении взгляда
 * // за один шаг робот изменяет одну свою координату на единицу
 * }
 * }
 * Direction, направление взгляда робота, - это перечисление:
 * <p>
 * public enum Direction {
 * UP,
 * DOWN,
 * LEFT,
 * RIGHT
 * }
 * Как это выглядит:
 * <p>
 * <p>
 * <p>
 * Пример
 * В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
 * <p>
 * Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
 * <p>
 * robot.turnRight();
 * robot.stepForward();
 * robot.stepForward();
 * robot.stepForward();
 * Требования:
 * 1. должен быть метод public static void moveRobot(Robot robot, int toX, int toY)
 * 2. метод moveRobot должен переместить робота в позицию int toX, int toY
 */

public class Robot_3_3_13 {
    public static void main(String[] args) {


    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public class Robot {
        public Direction getDirection() {
            // текущее направление взгляда
            return null;
        }
        public int getX() {
            // текущая координата X
            return 0;
        }
        public int getY() {
            // текущая координата Y
            return 0;
        }
        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
        }
        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
        }
        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }
}