package abstractBasic;

public class AbstractBasicImple2 extends AbstractBasic{

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("get stuff ready");
        System.out.println("Put int in the mic");
    }

    @Override
    void cleanUp() {
        System.out.println("Switch off the microwave");
    }
    
}
