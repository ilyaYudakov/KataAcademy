package JavaCore.Modul3;

/**
 * 3.3.13
 *
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y - снизу вверх. (Помните, как рисовали графики функций в школе?)
 *
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх,
 * вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 *
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 *
 * public class Robot {
 *
 * public Direction getDirection() {
 *      // текущее направление взгляда
 * }
 *
 * public int getX() {
 *      // текущая координата X
 * }
 *
 * public int getY() {
 *      // текущая координата Y
 * }
 *
 * public void turnLeft() {
 *      // повернуться на 90 градусов против часовой стрелки
 * }
 *
 * public void turnRight() {
 *      // повернуться на 90 градусов по часовой стрелке
 * }
 *
 * public void stepForward() {
 *      // шаг в направлении взгляда
 *      // за один шаг робот изменяет одну свою координату на единицу
 *      }
 * }
 * Direction, направление взгляда робота, - это перечисление:
 *
 * public enum Direction {
 *      UP,
 *      DOWN,
 *      LEFT,
 *      RIGHT
 * }
 * Как это выглядит:
 *
 * Пример
 * В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0,
 * robot.getDirection() == Direction.UP
 *
 * Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
 *
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
        Robot robot = new Robot(5,7, Direction.UP);
        moveRobot(robot, 14, 18);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Starting position " + robot.getX() + " " + robot.getY() + ", gaze direction " + robot.getDirection());
        if (robot.getX() >= toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
                System.out.println("Direction: " + robot.getDirection() + " robot direction" + robot.getX());
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
                System.out.println("Direction: " + robot.getDirection() + " robot direction" + robot.getX());
            }
        }
        if (robot.getY() >= toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
                System.out.println("Direction " + robot.getDirection() + " robot direction "+ robot.getY());
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
                System.out.println("Direction: " + robot.getDirection() + " robot direction" + robot.getY());
            }
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        private int x;
        private int y;
        private Direction direction;

        public Robot(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public Direction getDirection() {
            // текущее направление взгляда
            return direction;
        }

        public int getX() {
            // текущая координата X
            return x;
        }

        public int getY() {
            // текущая координата Y
            return y;
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
            switch (direction) {
                case UP:
                    direction = Direction.LEFT;
                    System.out.println("turning left");
                    break;
                case DOWN:
                    direction = Direction.RIGHT;
                    System.out.println("turning left");
                    break;
                case LEFT:
                    direction = Direction.DOWN;
                    System.out.println("turning left");
                    break;
                case RIGHT:
                    direction = Direction.UP;
                    System.out.println("turning left");
                    break;
            }
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
            switch (direction) {
                case UP:
                    direction = Direction.RIGHT;
                    System.out.println("turning right");
                    break;
                case DOWN:
                    direction = Direction.LEFT;
                    System.out.println("turning right");
                    break;
                case LEFT:
                    direction = Direction.UP;
                    System.out.println("turning right");
                    break;
                case RIGHT:
                    direction = Direction.DOWN;
                    System.out.println("turning right");
                    break;
            }
        }

        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
            switch (direction) {
                case UP:
                    System.out.println("move up");
                    y++;
                    break;
                case DOWN:
                    System.out.println("move down");
                    y--;
                    break;
                case LEFT:
                    System.out.println("move left");
                    x--;
                    break;
                case RIGHT:
                    System.out.println("move right");
                    x++;
                    break;
            }
        }
    }
}