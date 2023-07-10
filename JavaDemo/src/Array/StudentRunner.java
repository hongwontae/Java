package Array;


public class StudentRunner {

    int [] marks = {97,98,99,100,297};

    Student student = new Student("HWT",marks);

    int number1 = student.getNumber();

    int number2 = student.getTotal();

    int number3 = student.getMax();
    
    public static void main(String[] args) {

        StudentRunner s1 = new StudentRunner();

        System.out.println(s1.number1);
        System.out.println(s1.number2);
    }
}
