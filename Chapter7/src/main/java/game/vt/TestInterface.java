package game.vt;

public interface TestInterface {
    public void sayHello();

    public default void sayWorld() {
        System.out.println("World");
    }
}
