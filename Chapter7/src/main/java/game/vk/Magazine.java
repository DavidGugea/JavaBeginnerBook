package game.vk;

public class Magazine extends GameObject implements Buyable {
    double price;

    @Override
    public double price() {
        return this.price;
    }
}
