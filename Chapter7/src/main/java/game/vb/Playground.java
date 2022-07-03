package game.vb;

public class Playground {
    public static void main(String[] args) {
        Player buster = new Player();
        Room tower = new Room();

        buster.room = tower;
        tower.player = buster;
    }
}
