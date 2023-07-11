package Array;

import java.math.BigDecimal;

public class StudentRunner {

    // 생성자로 배열 객체를 줄 때는 new 타입 [] {n,n,n...}

    Student student = new Student("HWT", 99,98,1000);
    Student student1 = new Student("HWT", 44,55,66);
    Student student2 = new Student("HWT", 77,88,99,100);


    int number1 = student1.getNumber();

    int number2 = student1.getTotal();

    int number3 = student1.getMax();

    int number4 = student1.getMin();

    BigDecimal number5 = student1.getAverage();

    public static void main(String[] args) {

        StudentRunner s1 = new StudentRunner();

        System.out.println(s1.number1);
        System.out.println(s1.number2);
        System.out.println(s1.number3);
        System.out.println(s1.number4);
        System.out.println(s1.number5);
    }
}
