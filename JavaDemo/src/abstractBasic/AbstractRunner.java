package abstractBasic;

public class AbstractRunner {
    public static void main(String[] args) {
        
        AbstractBasicImpe ab = new AbstractBasicImpe();

        ab.execute();

        System.out.println();

        AbstractBasicImple2 ab2 = new AbstractBasicImple2();

        ab2.execute();
    }
    
}
