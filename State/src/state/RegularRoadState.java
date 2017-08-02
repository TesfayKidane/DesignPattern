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
public class RegularRoadState implements RoadState{
    
    @Override
    public void turnLeft() {
        System.out.println("5");
    }

    @Override
    public void turnRight() {
        System.out.println("5");
    }

    @Override
    public void accelerate() {
        System.out.println("9");
    }

    @Override
    public void brake() {
        System.out.println("8");
    }
    
}
