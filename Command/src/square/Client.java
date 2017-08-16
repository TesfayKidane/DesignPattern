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
public class Client {
    
    public static void main(String[] args){
        SquareOperationsReceiver squareOperationsReceiver = new SquareOperationsReceiver();
        ICommand createCommand = new CreateSquare(squareOperationsReceiver);
        ICommand scaleCommand = new ScaleSquare(squareOperationsReceiver);
        ICommand moveCommand = new MoveSquare(squareOperationsReceiver);
        
        SquareOperationsInvoker soi = new SquareOperationsInvoker(createCommand, scaleCommand, moveCommand);
        
        soi.create("Create 5");
        soi.scale("Scale 2");
        soi.move("Move right 2");
    }
    
}

