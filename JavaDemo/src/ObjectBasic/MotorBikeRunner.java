package ObjectBasic;

public class MotorBikeRunner {

    public static void main(String[] args) {

        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);

        MotorBike somethingElse = new MotorBike();

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(somethingElse.getSpeed());




    }
}
