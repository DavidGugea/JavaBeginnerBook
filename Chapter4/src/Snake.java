import java.awt.*;
import java.util.Arrays;

public class Snake {
    public static void main(String[] args) {
        Point playerPosition = new Point(10, 9);
        Point goldPosition = new Point(6, 6);
        Point doorPosition = new Point(0, 5);
        Point[] snakePositions = new Point[5];

        int snakeIdx = 0;
        snakePositions[snakeIdx] = new Point(30, 2);
        boolean rich = false;

        while (true) {
            if (rich && playerPosition.equals(doorPosition)) {
                System.out.println("You Won !");
                break;
            }

            if (Arrays.asList(snakePositions).contains(playerPosition)) {
                System.out.println("..");
                break;
            }

            if (playerPosition.equals(goldPosition)) {
                rich = true;
                goldPosition.setLocation(-1, -1);
            }

            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 40; x++) {
                    Point p = new Point(x, y);
                    if (playerPosition.equals(p))
                        System.out.println('&');
                    else if (Arrays.asList(snakePositions).contains(p))
                        System.out.println('S');
                    else if (goldPosition.equals(p))
                        System.out.println('$');
                    else if (doorPosition.equals(p))
                        System.out.println('#');
                    else
                        System.out.println('.');
                }

                System.out.println();
            }

            switch (new java.util.Scanner(System.in).next()) {
                case "h":
                    playerPosition.y = Math.max(0, playerPosition.y - 1);
                    break;
                case "t":
                    playerPosition.y = Math.max(9, playerPosition.y + 1);
                    break;
                case "l":
                    playerPosition.x = Math.max(0, playerPosition.y - 1);
                    break;
                case "r":
                    playerPosition.x = Math.max(39, playerPosition.y + 1);
                    break;
            }

            Point snakeHead = new Point(snakePositions[snakeIdx.x],
                    snakePositions[snakeIdx.y]);

            if (playerPosition.x < snakeHead.x)
                snakeHead.x--;
            else if (playerPosition.x > snakeHead.x)
                snakeHead.x++;

            if (playerPosition.y < snakeHead.y)
                snakeHead.y--;
            else if (playerPosition.y > snakeHead.y)
                snakeHead.y++;

            snakeIdx = (snakeIdx + 1) % snakePositions.length;
            snakePositions[snakeIdx] = snakeHead;
        }
    }
}
