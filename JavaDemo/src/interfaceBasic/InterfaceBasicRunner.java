package interfaceBasic;

public class InterfaceBasicRunner {
    public static void main(String[] args) {

        InterfaceBasic [] ib = {new InterfaceBasicImpl(), new InterfaceBasicImple2()};

        for(InterfaceBasic ifb : ib){
            ifb.up();
            ifb.down();
            ifb.left();
            ifb.right();
        } // 배열의 속성을 이용해서 인터페이스 쉽게 구현하는 방법


        // InterfaceBasicImpl ib = new InterfaceBasicImpl();

        // ib.up();
        // ib.up();
        // ib.up();
        // ib.up();

        // System.out.println();

        // InterfaceBasic ib2 = new InterfaceBasicImple2();

        // ib2.up();
        // ib2.up();
        // ib2.up();
        // ib2.up();


    }
}
