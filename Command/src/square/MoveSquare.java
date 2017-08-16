/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

/**
 *
 * @author Tesfay
 */
public class MoveSquare implements ICommand{

    private SquareOperationsReceiver squareOperationReceiver;

    public MoveSquare(SquareOperationsReceiver square) {
        this.squareOperationReceiver = square;
    }
    
    @Override
    public void execute(String command) {
        squareOperationReceiver.moveSquare(command);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
