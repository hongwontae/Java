package abstractBasic;

public abstract class AbstractBasic {

    public void execute(){
        getReady();
        doTheDish();
        cleanUp();
    }

    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanUp();
    
}
