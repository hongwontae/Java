package Array;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        String[] Hwt = { "HWT", "JERRAD", "LUCAS", "NEYMAR", "DIAZ", "SUAREZ" };
        int newLength = 10;
        
        System.out.println(Hwt[1]); // 인덱스로 배열에 접근하는 방법
        System.out.println(Hwt[4]); // 인덱스로 배열에 접근하는 방법
        Arrays.sort(Hwt); // 배열을 정렬하는 방법
        System.out.println(Arrays.toString(Hwt)); // 배열 콘텐츠 전부를 표현하는 방법
        System.out.println("--------------------------------------------------------------");

        int[] array = { 1, 0, 4, 5, 7, 2, 8, 6, 9, 3 };
        System.out.println("-----Arrays.toString()-----");
        System.out.println(array); // 주소값 출력 
        System.out.println(Arrays.toString(array)); // 배열 Contents 출력
        System.out.println();

        // sort를 사용하면 오름차순 정렬이 된다.
        System.out.println("-----Arrays.sort()-----");
        Arrays.sort(array); // 배열이 정렬된 상태가 된다.
        System.out.println(Arrays.toString(array));
        System.out.println();

        // Arrays.binarySearch()를 이용하면 해당 특정값을 찾아준다.
        // 검색 결과가 없거나 오류시 음수값을 반환한다.
        // 검색하기 전에는 오름차순으로 정렬되어있어야한다. -> 안그럼 음수값을 반환
        System.out.println("-----Arrays.binarySearch()-----");
        System.out.println(Arrays.binarySearch(array, 6));
        System.out.println(Arrays.binarySearch(array, 10));
        System.out.println();

        // Arrays.equals()를 이용하면 두 배열을 비교할 수 있다. 같으면 true, 틀리면 false
        int[] a1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] a2 = { 0, 1, 1, 1, 1, 1 };
        System.out.println("-----Arrays.equals()-----");
        System.out.println(Arrays.equals(array, a1));
        System.out.println(Arrays.equals(array, a2));
        System.out.println();

        // Arrays.fill()를 이용하면 배열을 초기화할 수 있다.
        System.out.println("-----Arrays.fill()-----");
        Arrays.fill(array, 0);
        System.out.println(Arrays.toString(array));
        Arrays.fill(array, 1);
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------------------------------");

        int [] s1 = Arrays.copyOf(array, newLength);
        System.out.println(Arrays.toString(s1));

        // 2023-07-10 Udemy Array
        System.out.println();
        System.out.println("---------------------------------for 문 연습");
        int [] i1 = {10,20,30,40,50,60,70,80,90,100};

         int sum=0;

        for(int iDemo: i1){
            sum=sum+iDemo;
        } //enhanced For

        System.out.println(sum);

        int [] i2 = {1,2,3,4,5,6,7,8,9,10};

        int sum1=0;

        for(int i2Demo:i2){
            System.out.print((sum1=sum1+i2Demo)+" d ");
        }

        System.out.println();

        int dnjs1 [] = {11,22,33,44,55,66,77,88,99,100};
        for(int i=0; i<dnjs1.length;i++){
            System.out.println(dnjs1[i]+"  정석적인 배열 for문");
        }



        

        System.out.println("for문 연습------------------------------------------------");

        System.out.println();

        int [] i3 = new int[10]; // 정석적인 방법이다. 배열의 값을 정하지 않으면 타입의 초기값으로 지정된다.
        System.out.println(Arrays.toString(i3)); // 초기값은 0 더블은 0.0
        System.out.println(i3.length); // 인덱스는 0~9, 길이는 10


        // 객체로 배열을 만든 후 초기값은 null 발생
        Person [] dnjs3 = new Person[10];
        System.out.println(Arrays.toString(dnjs3));



    }

    class Person{

    }

}
