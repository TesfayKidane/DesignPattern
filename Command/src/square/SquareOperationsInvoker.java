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
public class SquareOperationsInvoker {
    
    private ICommand createCommand;
    private ICommand scaleCommand;
    private ICommand moveCommand;

    public SquareOperationsInvoker(ICommand createCommand, ICommand scaleCommand, ICommand moveCommand) {
        this.createCommand = createCommand;
        this.scaleCommand = scaleCommand;
        this.moveCommand = moveCommand;
    }
    
    public void create(String command){
        createCommand.execute(command);
    }
    
    public void scale(String command){
        scaleCommand.execute(command);
    }
    
    public void move(String command){
        moveCommand.execute(command);
    }
}