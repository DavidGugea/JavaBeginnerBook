public class StringBuilderTest {
    public static void main(String[] args) {
        String[] elements = {"Manila", "Cebu", "Ipil"};
        String separator = ", ";
        StringBuilder sb = new StringBuilder();
        for (String elem : elements) {
            sb.append(elem).append(separator);
        }
        sb.setLength(sb.length() - separator.length());
        System.out.println(sb);
    }
}
