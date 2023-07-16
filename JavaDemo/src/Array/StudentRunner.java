package Array;

import java.math.BigDecimal;

public class StudentRunner {

    // 매개변수로 배열 객체를 줄 때는 new 타입 [] {n,n,n...}

    Student student = new Student("HWT", 99,98,1000);
    Student student1 = new Student("HWT", 44,55,66);
    Student student2 = new Student("HWT", 77,88,99,100);


    int number1 = student2.getNumber(); // 길이는?

    int number2 = student2.getTotal(); // 배열의 합

    int number3 = student2.getMax();

    int number4 = student2.getMin();

    BigDecimal number5 = student2.getAverage();

    public static void main(String[] args) {

        StudentRunner s1 = new StudentRunner();

        System.out.println(s1.number1);
        System.out.println(s1.number2);
        System.out.println(s1.number3);
        System.out.println(s1.number4);
        System.out.println(s1.number5);
    }
}
