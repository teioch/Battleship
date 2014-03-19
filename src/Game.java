/**
 * Created with IntelliJ IDEA.
 * User: Geir
 * Date: 3/4/14
 * Time: 15:51
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    public static void main(String[] args){
        Board board = new Board();
        Player player = new Player();

        for(Ship ship: player.getShips()){
            int x = 3;
            int y = 5;
            ship.setHorizontal(true);
            board.attemptPlacement(x, y, ship);
        }
    }
}
