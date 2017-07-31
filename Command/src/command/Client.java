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
public class Client {
    
    public static void main(String[] args){
        SquareOperations squareOperations = new SquareOperations();
        Command createCommand = new CreateSquare(squareOperations);
        Command scaleCommand = new ScaleSquare(squareOperations);
        Command moveCommand = new MoveSquare(squareOperations);
        
        SquareOperationsInvoker soi = new SquareOperationsInvoker(createCommand, scaleCommand, moveCommand);
        
        soi.create("Create 5");
        soi.scale("Scale 2");
        soi.move("Move right 2");
    }
    
}

