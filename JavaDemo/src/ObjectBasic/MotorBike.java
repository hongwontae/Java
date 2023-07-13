package ObjectBasic;

public class MotorBike {

    private int speed;

    MotorBike () {
        this(5);
    }

    MotorBike (int speed){
        this.speed=speed;
    }

    public int getSpeed () {
        return speed;
    }
}
