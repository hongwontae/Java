package interfaceBasic;

public class InterfaceBasicRunner {
    public static void main(String[] args) {
        InterfaceBasicImpl ib = new InterfaceBasicImpl();

        ib.up();
        ib.up();
        ib.up();
        ib.up();

        System.out.println();

        InterfaceBasic ib2 = new InterfaceBasicImple2();

        ib2.up();
        ib2.up();
        ib2.up();
        ib2.up();


    }
}
