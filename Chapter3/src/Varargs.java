import org.jetbrains.annotations.Contract;

public class Varargs {
    public static void main(String[] args) {
        System.out.println(avg(1, 2, 3, 4, 5));
    }

    public static double avg(double... array) {
        double sum = getSum(array);
        int length = array.length;

        return sum / length;
    }

    public static double getSum(double... array) {
        double returnSum = 0;

        for (double i : array) {
            returnSum += i;
        }

        return returnSum;
    }
}
