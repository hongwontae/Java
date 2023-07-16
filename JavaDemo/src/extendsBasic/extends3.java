package extendsBasic;

public class extends3 extends extends1 {

    // 기존에는 복제를 사용해서 클래스를 확장했는데 extends를 사용하면 복제하지 않아도 가져올 수 있다

    private String college;
    private int year;

    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
}
