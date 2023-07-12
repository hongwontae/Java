package Array;

import java.math.BigDecimal;

public class StudentRunnerArrayList {

    // 매개변수로 배열 객체를 줄 때는 new 타입 [] {n,n,n...}

    StudentArrayList student = new StudentArrayList("HWT", 99,98,1000);
    StudentArrayList student1 = new StudentArrayList("홍원태", 44,55,66);
    StudentArrayList student2 = new StudentArrayList("HWT", 77,88,99,100);


    int number1 = student1.getNumber();

    int number2 = student1.getTotal();

    int number3 = student1.getMax();

    int number4 = student1.getMin();

    BigDecimal number5 = student1.getAverage();


    public static void main(String[] args) {

        StudentRunnerArrayList s1 = new StudentRunnerArrayList();

        System.out.println(s1.number1);
        System.out.println(s1.number2);
        System.out.println(s1.number3);
        System.out.println(s1.number4);
        System.out.println(s1.number5);

        System.out.println(s1.student);



    }
}
