package extendsBasic;

public class extendsRuuner {

    public static void main(String[] args) {
        
        extends3 runner = new extends3();

        runner.setGetName("hwt");
        System.out.println(runner.getGetName());

        System.out.println(runner);
        System.out.println(runner.toString()); // 같은 해시코드를 가르킨다.

        extends1 runner2 = new extends1();

        runner2.setGetName("HWT");
        runner2.setEmail("dnjsxoghd@naver.conm");
        runner2.setPhoneNumber("010-8489-3121");
        System.out.println(runner2);
    }

    
    
}
