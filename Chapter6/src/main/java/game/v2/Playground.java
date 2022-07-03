package game.v2;

public class Playground {
    public static void main(String[] args) {
        Player p = new Player();
        p.name = "Test name";
        p.item = "Test item";

        System.out.printf("%s | %s", p.name, p.item);
    }
}
