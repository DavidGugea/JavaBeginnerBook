package game.vt;

public interface GameLifecycle {
    void start();
    void finish();

    default void pause() {}
}
