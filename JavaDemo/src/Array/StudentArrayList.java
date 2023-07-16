package array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {

    private String HWT;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public StudentArrayList(String string, int... marks) {
        this.HWT=HWT;
        for(int mark : marks){
            this.marks.add(mark);
        };
    }

    public int getNumber(){
        return marks.size();
    }

    public int getTotal() {
        int sum=0;
        for(int m1:marks){
            sum+=m1;
        }

        return sum;
    }

    // for문은 정석을 좀 알아보자
    public int getMax() {

        return Collections.max(marks);
    }

    public int getMin() {

        return Collections.min(marks);
    }

    public BigDecimal getAverage(){
        int sum=getTotal();
        int number = getNumber();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3,RoundingMode.UP);
    }

    public String toString(){
        return HWT+marks;
    }

    public void addNewMark(int mark){
        marks.add(mark);
    }
}
