package Array;

import java.util.Arrays;

public class StringRunner {

    public static void main(String[] args) {

        String dayOfWeek[] = new String[6];
        dayOfWeek[0] = "Sunday";
        dayOfWeek[1] = "Monday";
        dayOfWeek[2] = "Tuesday";
        dayOfWeek[3] = "Wednesday";
        dayOfWeek[4] = "Thursday";
        dayOfWeek[5] = "Friday";
        dayOfWeek[5] = "satuarday";

        System.out.println(Arrays.toString(dayOfWeek));

        // 가장 큰 길이의 요일을 뽑는 로직
        String dayWithMostCharacters = "";
        for (String day : dayOfWeek) {
            if (day.length()>dayWithMostCharacters.length()) {
                dayWithMostCharacters=day;
            }
        } // for 문에 if가 있으면 하나만 출력된다.
    
        // 날짜를 역순으로 출력하는 로직
        for(int i=dayOfWeek.length-1; i>=0; i--){
            System.out.println(dayOfWeek[i]);
        }

        System.out.println("Most Length :  "+dayWithMostCharacters);


    }
}
