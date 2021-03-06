package game.vc;

import java.util.ArrayList;

public class Room {
    private final ArrayList<Player> players = new ArrayList<Player>();

    public void addPlayer ( Player player ) {
        players.add(player);
    }

    public void listPlayers() {
        for(Player player : players)
            System.out.println(player.name);
    }
}
