import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Geir
 * Date: 3/4/14
 * Time: 15:46
 * To change this template use File | Settings | File Templates.
 */
public class Board {
    private Cell[][] board = new Cell[9][9];

    public Board(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = new Cell();
            }
        }
    }

    public boolean hasShip(int x, int y){
        return board[x][y].isOccupied();
    }

    public boolean attemptPlacement(int x, int y, Ship ship){
        List<Cell> cells = new ArrayList<Cell>();
        final int size = ship.getType().getSize();

        if(ship.isHorizontal()){
            for(int i = 0; i < size; i++){
                if((y+i) >= board.length){
                    return false;
                }
                if(board[x][y+i].isOccupied()){
                    return false;
                }
                else{
                    cells.add(board[x][y+i]);
                }
            }
        }
        else{
            for(int i = 0; i < size; i++){
                if((x+i) >= board.length){
                    return false;
                }
                if(board[x+i][y].isOccupied()){
                    return false;
                }
                else{
                    cells.add(board[x+i][y]);
                }
            }
        }
        for(Cell cell: cells){
            cell.storeShip(ship);
        }
        return true;
    }
}
