/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Tesfay
 */
public class Client {
    
    public static void main(String[] args){
        CarRace carRace = new CarRace(0);
        System.out.println(carRace);
        carRace.turnLeft();
        carRace.accelerate();
        carRace.turnRight();
        carRace.brake();
        
        carRace.setLevel(1);
        System.out.println(carRace);
        carRace.turnLeft();
        carRace.accelerate();
        carRace.turnRight();
        carRace.brake();
        
        carRace.setLevel(2);
        System.out.println(carRace);
        carRace.turnLeft();
        carRace.accelerate();
        carRace.turnRight();
        carRace.brake();
        
        carRace.setLevel(3);
        System.out.println(carRace);
        carRace.turnLeft();
        carRace.accelerate();
        carRace.turnRight();
        carRace.brake();
        
    }
}
