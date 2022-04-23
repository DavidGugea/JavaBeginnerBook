public class StringBuilderCompareTest {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("This is a test.");
        StringBuilder sb2 = new StringBuilder("This is a test.");
        System.out.println(sb1.compareTo(sb2) == 0); // true
        System.out.println(CharSequence.compare(sb1, sb2) == 0); // true
    }
}
