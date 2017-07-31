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
public class SquareOperationsInvoker {
    
    private Command createCommand;
    private Command scaleCommand;
    private Command moveCommand;

    public SquareOperationsInvoker(Command createCommand, Command scaleCommand, Command moveCommand) {
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