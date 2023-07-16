package abstractAndinterface;

public class InterImpl implements inter2 {

    @Override
    public void up() {
    System.out.println("Move up");
    }

    @Override
    public void down() {
     System.out.println("Move down");   
    }

    @Override
    public void right() {
      System.out.println("Move rigth");  
    }

    @Override
    public void left() {
     System.out.println("Move left");   
    }

    @Override
    public void shut() {
      System.out.println("Move shut");  
    }
    
}
