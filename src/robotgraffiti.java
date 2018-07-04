import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class robotgraffiti {
public static void main(String[] args) {
	Robot r2d2 = new Robot ();
	r2d2.setSpeed(100);
	r2d2.penDown();
    r2d2.setPenColor(Color.RED);
	r2d2.turn(40);
    r2d2.move(110);
	r2d2.turn(110);
	r2d2.move(110);
    r2d2.move(-55);
	r2d2.turn(120);
	r2d2.move(75);
	r2d2.hide();
}
}
