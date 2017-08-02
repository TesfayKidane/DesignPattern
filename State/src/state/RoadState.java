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
public interface RoadState {
        public void turnLeft();
        public void turnRight();
        public void accelerate();
        public void brake();
}
