import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Ship> ships;

    public Player(){
        ships = new ArrayList<Ship>();
        ships.add(new Ship(Type.BATTLESHIP));
        ships.add(new Ship(Type.FRIGATE));
        ships.add(new Ship(Type.CORVETTE));
        ships.add(new Ship(Type.CORVETTE));
        ships.add(new Ship(Type.CORVETTE));
    }

    public List<Ship> getShips(){
        return ships;
    }
}
