package abstractBasic;

public class AbstractBasicImpe extends AbstractBasic{

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("Do the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean UP");
    }
    
}
