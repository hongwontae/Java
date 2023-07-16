package arrayList;

import java.util.ArrayList;


public class ArrayLists {

    public static void main(String[] args) {

        // ArrayList list = new ArrayList();// 타입 미설정 Object로 선언된다.
        // ArrayList<Student> members = new ArrayList<Student>();// 타입설정 Student객체만 사용가능
        // ArrayList<Integer> num = new ArrayList<Integer>();// 타입설정 int타입만 사용가능
        // ArrayList<Integer> num2 = new ArrayList<>();// new에서 타입 파라미터 생략가능
        // ArrayList<Integer> num3 = new ArrayList<Integer>(10);// 초기 용량(capacity)지정
        // ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));//
        // 생성시 값추가

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3); // 값 추가
        list.add(null); // null값도 add가능
        list.add(1, 10); // index 1에 10 삽입

        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        // list.clear();
        // System.out.println(list);
        System.out.println(list.size());



    }

}
