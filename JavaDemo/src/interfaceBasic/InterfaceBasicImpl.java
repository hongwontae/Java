package interfaceBasic;

public class InterfaceBasicImpl implements InterfaceBasic {

    @Override
    public void up() {
       System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Down");
    }

    @Override
    public void left() {
       System.out.println("left");
    }

    @Override
    public void right() {
        System.out.println("right");
    }
    
}
