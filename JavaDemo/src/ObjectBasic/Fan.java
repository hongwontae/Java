package ObjectBasic;

public class Fan {

    private String make;
    private double radius;
    private String color;

    private boolean isOn;

    private byte speed;
    public Fan(String make, double radius, String color){
        this.make=make;
        this.radius=radius;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "make='" + make + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                ", speed=" + speed +
                '}';
    }




}
