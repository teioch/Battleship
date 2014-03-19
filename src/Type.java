/**
 * Created with IntelliJ IDEA.
 * User: Geir
 * Date: 3/4/14
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 */
public enum Type {
    BATTLESHIP(5),
    FRIGATE(4),
    CORVETTE(3);

    private int size;
    Type(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}

