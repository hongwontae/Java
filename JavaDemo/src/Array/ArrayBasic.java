package Array;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        String[] Hwt = { "HWT", "JERRAD", "LUCAS", "NEYMAR", "DIAZ", "SUAREZ" };
        int newLength = 10;

        System.out.println(Hwt[1]); // 인덱스로 배열에 접근하는 방법
        System.out.println(Hwt[4]); // 인덱스로 배열에 접근하는 방법
        Arrays.sort(Hwt);
        System.out.println(Arrays.toString(Hwt));
        System.out.println("--------------------------------------------------------------");

        int[] array = { 1, 0, 4, 5, 7, 2, 8, 6, 9, 3 };
        System.out.println("-----Arrays.toString()-----");
        System.out.println(array);
        System.out.println(Arrays.toString(array));
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
        

    }

}
