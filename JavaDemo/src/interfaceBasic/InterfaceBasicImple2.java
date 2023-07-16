package interfaceBasic;

public class InterfaceBasicImple2 implements InterfaceBasic{

    @Override
    public void up() {
        System.out.println("Move piece up");
    }

    @Override
    public void down() {
    System.out.println("Move piece down");
    }

    @Override
    public void left() {
    System.out.println("Move piece left");
    }

    @Override
    public void right() {
        System.out.println("Move piece right");
    }
    
}
