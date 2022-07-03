package game.vl;

import java.util.logging.*;

public interface Logged {
    default void error(String message) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, message);
    }
}
