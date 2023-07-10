package Array;

public class Student {

    private String HWT;
    private int[] marks;

    public Student(String string, int[] marks) {
        this.HWT=HWT;
        this.marks=marks;
    }

    public int getNumber(){
        return marks.length;
    }

    public int getTotal() {
        int sum=0;
        for(int m1:marks){
            sum=+m1;
        }

        return sum;
    }

    // for문은 정석을 좀 알아보자
    public int getMax() {
        var maxmum=0;
        for(int m2:marks){
            if(m2>maxmum){
                maxmum=m2;
            }
            
        }

        return maxmum;
    }

}
