import java.util.Scanner;

public class BinaryBanner {
    public static void printLetter(char[][] letter) {
        for (int column = 0; column < letter[0].length; column++) {
            for (int line = letter.length - 1; line >= 0; line--) {
                System.out.println(letter[line][column]);
            }
        }
        System.out.println();
    }

    public static void printZero() {
        char[][] zero = {
                {' ', '#', ' '},
                {'#', ' ', '#'},
                {'#', ' ', '#'},
                {'#', ' ', '#'},
                {' ', '#', ' '},
        };

        printLetter(zero);
    }

    public static void printOne() {
        char[][] one = {
                {' ', '#'},
                {'#', '#'},
                {' ', '#'},
                {' ', '#'},
                {' ', '#'},
        };

        printLetter(one);
    }

    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();
        String bin = Integer.toBinaryString(input);
        System.out.printf("Banner für %s (binär %s) : %n", input, bin);

        for (int i = 0; i < bin.length(); i++) {
            switch (bin.charAt(i)) {
                case '0':
                    printZero();
                    break;
                case '1':
                    printOne();
                    break;
            }
        }
    }
}
