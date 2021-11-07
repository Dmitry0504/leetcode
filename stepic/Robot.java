package stepic;

public class Robot {
    int x;
    int y;
    Direction direction;
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
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int currX = robot.getX();
        int currY = robot.getY();

        if (currX - toX > 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (currX > toX) {
                robot.stepForward();
                currX = robot.getX();
            }

            if (currY - toY > 0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                while (currY > toY) {
                    robot.stepForward();
                    currY = robot.getY();
                }
            }
            if (currY - toY < 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                while (currY < toY) {
                    robot.stepForward();
                    currY = robot.getY();
                }
            }
        }

        if (currX - toX < 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (currX < toX) {
                robot.stepForward();
                currX = robot.getX();
            }

            if (currY - toY > 0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                while (currY > toY) {
                    robot.stepForward();
                    currY = robot.getY();
                }
            }
            if (currY - toY < 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                while (currY < toY) {
                    robot.stepForward();
                    currY = robot.getY();
                }
            }
        }

        if (currX == toX) {
            if (currY - toY > 0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                while (currY > toY) {
                    robot.stepForward();
                    currY = robot.getY();
                }
            }
            if (currY - toY < 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                while (currY < toY) {
                    robot.stepForward();
                    currY = robot.getY();
                }
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.direction = Direction.UP;
        robot.x = 10;
        robot.y = 10;

        moveRobot(robot, 0, 0);

        System.out.println("x " + robot.x + " y " + robot.y);
    }

}
