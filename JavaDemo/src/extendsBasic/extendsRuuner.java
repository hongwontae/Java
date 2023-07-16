package extendsBasic;

public class extendsRuuner {

    public static void main(String[] args) {
        
        extends3 runner = new extends3(null);


        System.out.println(runner);
        System.out.println(runner.toString()); // 같은 해시코드를 가르킨다.

        extends1 runner2 = new extends1(null);
        
        runner2.setEmail("dnjsxoghd@naver.conm");
        runner2.setPhoneNumber("010-8489-3121");
        System.out.println(runner2);
    }

    
    
}
