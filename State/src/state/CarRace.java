/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tesfay
 */
public class CarRace {

    private RoadState regularRoadState;
    private RoadState gravelRoadState;
    private RoadState wetRoadState;
    private RoadState iceRoadState;
    static private List<RoadState> states;

    static {
        states = new ArrayList<>(Arrays.asList(
                new RegularRoadState(),
                new GravelRoadState(),
                new WetRoadState(),
                new IceRoadState()
        ));
    }

    private RoadState currentRoadState = regularRoadState;
    private int level = 0;

    public CarRace(int level) {
        if (level > 3 || level < 0) {
            System.err.print("Level should be between 0 and 3 (inclusive)");
            return;
        }
        currentRoadState = states.get(level);

        regularRoadState = states.get(0);
        gravelRoadState = states.get(1);
        wetRoadState = states.get(2);
        iceRoadState = states.get(3);

    }

    public void turnLeft() {
        currentRoadState.turnLeft();
    }

    public void turnRight() {
        currentRoadState.turnRight();
    }

    public void accelerate() {
        currentRoadState.accelerate();
    }

    public void brake() {
        currentRoadState.brake();
    }

    public RoadState getCurrentRoadState() {
        return currentRoadState;
    }

    public void setCurrentRoadState(RoadState currentRoadState) {
        this.currentRoadState = currentRoadState;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        setCurrentRoadState(states.get(level));
    }

    @Override
    public String toString() {
        return "CarRace{" + "currentRoadState=" + currentRoadState + '}';
    }

}
