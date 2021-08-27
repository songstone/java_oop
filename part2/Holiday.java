package part2;

import java.util.Arrays;

public class Holiday {
    // 휴가(매월 1일) 클래스
    private String[] substituteHoliday = {"20220912", "20221010"};
    private String year;
    private String month;
    private String day;
    private boolean isHoliday;


    public Holiday(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Holiday() {
        // 기본값을 넣어줌 default in String is null
        this(null, null, null);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String combineDate(String year, String month, String day){
        return year + month + day;
    }

    public void checkHoliday(String date){
        isHoliday = Arrays.asList(substituteHoliday).contains(date);
        if(isHoliday){
            System.out.println("오늘은 휴일입니다.");
        }else{
            System.out.println("오늘은 휴일이 아닙니다.");
        }
    }

    Holiday getHoliday(){
        return this;
    }
}
