package game.vh;

public class Key extends GameObject {
    int id;

    public Key(int id) {
        this.id = id;
    }

    @Override
    public boolean useOn(GameObject object) {
        if (object instanceof Door)
            if ( id == ((Door) object).id)
                return ((Door) object).isOpen = true;

        return false;
    }
}
