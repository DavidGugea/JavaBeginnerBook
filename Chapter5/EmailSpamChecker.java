public class EmailSpamChecker {
    public static void main(String[] args) {
        String email1 = "Hallo Chris, alle fit im Schritt?";
        System.out.println(containsSpam(email1));
        String email2 = "This is spam email";
        System.out.println(containsSpam(email2));
    }

    private static boolean containsSpam(String email) {
        return email.contains("spam");
    }
}
