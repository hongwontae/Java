package abstractAndinterface;

interface Flyable{
    void bark();
}



class birdImpl implements Flyable{
    @Override
    public void bark() {
        System.out.println("pow pow");
    } 
}

class PlainImpl implements Flyable{
    @Override
    public void bark() {
        System.out.println("fuel fuel");
    }
}


public class InterfaceHigh {

    public static void main(String[] args) {
        
        Flyable [] f1 = {new birdImpl(), new PlainImpl()};

        for(Flyable object: f1){
            object.bark();
        }

    }
    
}
