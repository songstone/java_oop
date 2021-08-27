package part1;

import part2.Holiday;
import part2.HolidayTest;

public class ByteCode {
    public static void main(String[] args) {
//        double position = 1.0;
        double position = 3.4;
        int init = (int)position;
        double rate = 1.0;

        position = init + rate * 60;
    }
}


