package JavaConstructor;

public class Person {
    
    private String hwt;

    private String alonse;

    private String jerrad;

    private String maschrano;

    public Person(String hwt, String alonso){
        this.hwt = hwt;
        this.alonse = alonso;
    }

    public Person (){
        this("제라드","알론소");
    }



    public void showInfo(){
        System.out.println(hwt);
        System.out.println(alonse);
    }




}
