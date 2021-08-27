package part1;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
//        int a = 5;
//        System.out.println(a + 2);
//        System.out.println(a - 2);
//        System.out.println(a * 2);
//        System.out.println(a / 2);
//        System.out.println(Math.floorDiv(a,2));
//        System.out.println(a % 2);
//        System.out.println(Math.floorMod(a,2));

//        System.out.println(a << 2);
//        System.out.println(a >>> 2);
//        System.out.println(a & 2);
//        System.out.println(a | 2);
//        System.out.println(a ^ 2);

//        int b = 9;
//        for(int i=0; i<3; i++){
//            b -= 1;
//            System.out.println(b);
//        }
//        b = 9;
//        for(int i=0; i<3; i++){
//            System.out.println(--b);
//        }
//        System.out.println(true && false);
//        System.out.println(true || false);
//        System.out.println(!true);
        // 단락 회로 평가
//        int a = 10;
//        int b = 2;
//        boolean value = ((a += 10) < 10) && ((b += 2) < 10);
//        System.out.println(value);
//        System.out.println(a);
//        System.out.println(b);
        // 삼항 조건 연산자
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("두 개의 수를 입력하세요");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println("두 개의 수 중 더 큰 수는");
//        System.out.println(num1>num2 ? num1 : num2);
////        System.out.println(Math.max(num1, num2)); // 같은 결과

        // 비트 연산자
        int num1 = 5;  //00000101
        int num2 = 10; //00001010
//
//        System.out.println(~num1);          //11111010
//        System.out.println(num1 & num2);    //00000000
        System.out.println(num1 | num2);    //00001111
        System.out.println(num1 ^ num2);    //00001111

        System.out.println(~num1); //11111010
        System.out.println(num1 & num2);

        System.out.println(num1 << 2);      //00010100
        System.out.println(num1 >> 2);      //00000001
        System.out.println(num1 >>> 2);     //00000001
        System.out.println(num1 >>= 2);     //00010100
        System.out.println(num1);           //00010100

//
//        System.out.println(2e32-1);



    }
}