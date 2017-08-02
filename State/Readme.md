A multilevel computer game simulates driving a car. In the initial level, the road condition is "regular". As the player moves to higher levels, new conditions of the road appear, from regular to gravel, wet, and ice. The response to the car's controls, steering, braking, etc., varies with the road conditions. The game employs a State pattern to react to the player's use of the car controls.
For the purpose of this exercise, design a small GUI with four buttons (labeled left, accel, right and brake), a choice of conditions (labeled regular, gravel, wet and ice), and a feedback textfield showing the effect (in an arbitrary scale) of pressing a button in a given road condition as follows:
```
Regular Gravel Wet Ice
left 5 3 4 1
accel 9 7 9 3
right 5 3 4 1
brake 8 6 7 2
```