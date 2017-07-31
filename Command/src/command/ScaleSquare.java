/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Tesfay
 */
public class ScaleSquare implements Command{

    private SquareOperations square;

    public ScaleSquare(SquareOperations square) {
        this.square = square;
    }
    
    
    @Override
    public void execute(String command) {
        square.scale(command);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
