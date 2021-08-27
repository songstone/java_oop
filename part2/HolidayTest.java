package part2;

public class HolidayTest {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
        Holiday today1 = new Holiday();
        System.out.println(today1.getYear()+""+today1.getMonth()+"월"+today1.getDay()+"일");
        today1.setYear("2022");
        today1.setMonth("09");
        today1.setDay("11");
        String date1 = today1.combineDate(today1.getYear(), today1.getMonth(), today1.getDay());
        today1.checkHoliday(date1);


        Holiday today2 = new Holiday();
        today2.setYear("2022");
        today2.setMonth("09");
        today2.setDay("12");
        String date2 = today2.combineDate(today2.getYear(), today2.getMonth(), today2.getDay());
        today2.checkHoliday(date2);

        System.out.println(date1 == date2);
        System.out.println(date1.equals(date2));

//        Holiday today3 = new Holiday("2022", "09", "12");
//        System.out.println(today3);
//        System.out.println(today3.getHoliday());
//        System.out.println(today2);


    }
}
