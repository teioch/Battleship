/**
 * Created with IntelliJ IDEA.
 * User: Geir
 * Date: 3/4/14
 * Time: 15:46
 * To change this template use File | Settings | File Templates.
 */
public class Ship {
    private Type type;
    private boolean horizontal;

    public Ship(Type type){
        this.type = type;
    }

    public Type getType(){
        return type;
    }

    public void setHorizontal(boolean status){
        this.horizontal = status;
    }

    public boolean isHorizontal(){
        return horizontal;
    }
}
