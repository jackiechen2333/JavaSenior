package cx.exer;

/**
 * @Author cx
 * @Date 2023/02/07/16:06
 */
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {

            int minYear = this.getYear() - o.getYear();
            if (minYear != 0){
                return minYear;
            }

            int minMonth = this.getMonth() - o.getMonth();
            if (minMonth != 0){
                return minMonth;
            }

            return this.getDay() - o.getDay();
    }

//    @Override
//    public int compareTo(Object o) {
//        if(o instanceof MyDate){
//            MyDate myDate = (MyDate) o;
//
//            int minYear = this.getYear() - myDate.getYear();
//            if (minYear != 0){
//                return minYear;
//            }
//
//            int minMonth = this.getMonth() - myDate.getMonth();
//            if (minMonth != 0){
//                return minMonth;
//            }
//
//            return this.getDay() - myDate.getDay();
//        }
//        throw new RuntimeException("传入的数据类型不一致");
//    }
}
