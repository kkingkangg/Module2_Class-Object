import java.util.Scanner;
public class Fan {
    final int SLOW = 1;
    final int MEDIUM= 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";

    public void setSpeed (int speed) {
        this.speed = speed;
    }
    public int getSpeed () {
        return this.speed;
    }

    public void setOn (boolean power) {
        this.on = power;
    }
    public boolean getOn () {
        return this.on;
    }

    public void setColor (String color) {
        this.color = color;
    }
    public String getColor () {
        return this.color;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return this.radius;
    }

    public Fan(){}

    public String toString(){
        if (on) {
            return "Fan: {" +
                    "speed is " + speed +
                    " color is " + color +
                    " radius is " + radius +
                    "} Fan is on";
        } else {
            return "Fan: {" +
                    " color is " + color +
                    " radius is " + radius +
                    "} Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());


    }
}
