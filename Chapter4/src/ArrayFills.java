import java.util.Arrays;

public class ArrayFills {
    public static void main(String[] args) {
        char[] chars = new char[5];
        Arrays.fill(chars, '*');

        System.out.println(Arrays.toString(chars));
    }
}
