package abstractAndinterface;

public class AbstractImplementsRunner extends AbstractImplements {

    @Override
    public void up() {
        System.out.println(1232);
    }

    @Override
    public void down() {
        System.out.println(3939);
    }

    @Override
    public void right() {
        System.out.println(282828);
    }

    @Override
    public void left() {
        System.out.println(98779832);
    }
    public static void main(String[] args) {
        AbstractImplementsRunner air = new AbstractImplementsRunner();

        air.up();
        air.down();
        air.left();
        air.right();
    }
    
}
