package extendsBasic;

import java.math.BigDecimal;

public class EmployeeRunner {
    public static void main(String[] args) {
        
        Employee em1 = new Employee("Hwt","Developer");
        Employee em2 = new Employee("Hwt","Developer");


        em1.setEmail("feelchok1234@Gmail.com");
        em1.setPhoneNumber("010 8489 3121");
        em1.setEmployerName("Hwt");
        em1.setEmployeeGrade('2');
        em1.setSalary(new BigDecimal(3000));
        // 객체로 만든 순수한 클래스는 setter를 통해서 값이 출력되지만 extneds의 슈퍼 클래스의 setter 값은
        // 들어오지 않는다.

        //System.out.println(em1);
        System.out.println(em2);

    }
}
