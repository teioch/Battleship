/**
 * Created with IntelliJ IDEA.
 * User: Geir
 * Date: 3/4/14
 * Time: 15:47
 * To change this template use File | Settings | File Templates.
 */
public class Cell {
    private boolean occupied;
    private Ship ship;

    public Cell(){
        this.occupied = false;
    }

    public void storeShip(Ship ship){
        this.ship = ship;
        occupied = true;
    }

    public boolean isOccupied(){
        return this.occupied;
    }
}
