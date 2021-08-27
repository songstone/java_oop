package part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        // while 문
        /*
        Scanner scanner = new Scanner(System.in);
        int amount = 1;
        int maxCount = 10;

        while (amount > 0 && maxCount > 0){
            amount = scanner.nextInt();
            maxCount--;
//            System.out.println("남은 송금 횟수는 "+ maxCount + "번 입니다.");
            System.out.printf("남은 송금 횟수는 %d번 입니다.%n", maxCount);
        }
        if(amount <= 0){
            System.out.println(amount+"원은 송금할 수 없습니다.");
        }
        else{
            System.out.println("무료 송금 가능 최대 횟수를 초과하였습니다.");
        }
        */

        // for 문
        /*
        Scanner scanner = new Scanner(System.in);
        int maxCount;
        for(maxCount = 9; maxCount >= 0; maxCount--){
            int amount = scanner.nextInt();
            if(amount <= 0){
                System.out.println(amount+"원은 송금할 수 없습니다.");
                break;
            }
            System.out.printf("남은 송금 횟수는 %d번 입니다.%n", maxCount);
        }
        if(maxCount == 0) {
            System.out.println("무료 송금 가능 최대 횟수를 초과하였습니다.");
        }

         */


        // do while 문
        /*
        int amount = 1;
        int maxCount = 10;

        do{
            amount = scanner.nextInt();
            maxCount--;
            System.out.println("남은 송금 횟수는 %d번 입니다.", maxCount);
        }while(amount > 0 && maxCount > 0);

        if(amount <= 0){
            System.out.println(amount+"원은 송금할 수 없습니다.");
        }
        else{
            System.out.println("무료 송금 가능 최대 횟수를 초과하였습니다.");
        }
        */

        // Nested Loop
        /*
        int[][] bankDeposit = {{300, 200, 100}, {2, 30}, {300, 50}};
        int[] bankBalance = {0, 0, 0};

        for(int i = 0; i < bankDeposit.length; i++){
            System.out.println("%d번째 은행 입금 이력은 %s입니다.", i, Arrays.toString(bankDeposit[i]));
            for(int j = 0; j < bankDeposit[i].length; j++){
                bankBalance[i] += bankDeposit[i][j];
            }
        }
        System.out.println(Arrays.toString(bankBalance));
         */

        // Continue
        /*
        Scanner scanner = new Scanner(System.in);
        for(int maxCount = 9; maxCount >= 0; ){
            int amount = scanner.nextInt();
            if(amount <= 0) {
                System.out.println(amount + "원은 송금할 수 없습니다. 다시 입력해주세요.");
                continue;
            }
            System.out.printf("남은 송금 횟수는 %d번 입니다.%n", maxCount);
            maxCount--;
        }
        System.out.println("무료 송금 가능 최대 횟수를 초과하였습니다.");
        */

        // Refactoring Loop
        /*
        ArrayList<Integer> array = new ArrayList<>(2);
        array.add(3);
        array.add(4);
        int arraySize = array.size();
        for(int i=0; i<arraySize; i++){
            System.out.println(i);
        }
        */

        // Nested Loop Break
        // Break Only InnerLoop
//        hyerinloop:
//        for (int i=0; i < 5; i++) {
//            for (int j=0; j < 5; j++) {
//                if (i * j > 6) {
//                    System.out.println("Breaking");
//                    break hyerinloop;
//                }
//                System.out.println(i + " " + j);
//            }
//        }

        //Break OuterLoop
        // 방법1
//        outerloop:
//        for (int i=0; i < 5; i++) {
//            for (int j=0; j < 5; j++) {
//                if (i * j > 6) {
//                    System.out.println("Breaking");
//                    break outerloop;
//                }
//                System.out.println(i + " " + j);
//            }
//        }
//        System.out.println("Done");

        // 방법2
        loop();
        System.out.println("Done");
        ArrayList<String> a = new ArrayList<>();
    }
    public static void loop() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking");
                    return;
                }
                System.out.println(i + " " + j);


            }
        }
    }

}