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
public class CreateSquare implements ICommand{

    private SquareOperationsReceiver squareOperationReceiver;

    public CreateSquare(SquareOperationsReceiver square) {
        this.squareOperationReceiver = square;
    }
   
    @Override
    public void execute(String command) {
       squareOperationReceiver.createSquare(command);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
