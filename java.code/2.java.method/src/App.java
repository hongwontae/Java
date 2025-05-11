public class App {

    public static void main(String[] args) throws Exception {
     Test test = new Test();
        test.testFunction(5);
    }

    public static void mathWorking(int num){
        for(int i = 1; i<=9 ; i++){
            System.out.printf("%d * %d = %d", i, num, i*num).println();
        }
    }

    public static void mathWorking(int num1, int num2){
        System.out.printf("%d+%d = %d", num1, num2, num1+num2).println();
    }

}
