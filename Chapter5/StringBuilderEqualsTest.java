public class StringBuilderEqualsTest {
    public static void main(String[] args) {
        String s = "This is a test";
        StringBuilder sb = new StringBuilder("This is a test");

        System.out.println(s.equals(sb)); // false
        System.out.println(s.equals(sb.toString())); // true
        System.out.println(s.contentEquals(sb)); // true
    }
}
