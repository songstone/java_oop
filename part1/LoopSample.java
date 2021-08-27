package part1;

import java.util.Scanner;
import java.util.Arrays;

public class LoopSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 1;
        int maxCount = 10;
        // while 문
//        while (maxCount > 0) {
//            amount = scanner.nextInt();
//            //무한 루프가 돌지 않기 위한 수행문;
//            if(amount > 0) {
//                maxCount--;
//                System.out.println("남은 송금 횟수는 " + maxCount + "번 입니다.");
//            }else{
//                System.out.println("0원은 송금할 수 없습니다. 다시 입력해주세요.");
//            }
//        }
//        System.out.println("송금 가능한 회수를 초과했습니다.");
        // for 문
//        for(maxCount = 9; maxCount >=0; maxCount--){
//            amount = scanner.nextInt();
//            if(amount <= 0){
//                System.out.println(amount+"원은 송금할 수 없습니다.");
//                maxCount++;
//                continue;
//            }
//            System.out.printf("남은 송금 횟수는 %d번 입니다.%n", maxCount);
//        }
//        if(maxCount == 0) {
//            System.out.println("무료 송금 가능 최대 횟수를 초과하였습니다.");
//        }

        // do while 문
//        do{
//            amount = scanner.nextInt();
//            //무한 루프가 돌지 않기 위한 수행문;
//            maxCount--;
//            System.out.println("남은 송금 횟수는 " + maxCount + "번 입니다.");
//        }while(amount > 0 && maxCount > 0);
//        if(amount <= 0) {
//            System.out.printf("%d원은 송금할 수 없습니다.", amount);
//        }else{
//            System.out.println("송금 가능한 회수를 초과했습니다.");
//        }

        // Nested for 문
//        int[][] bankDeposit = {{300, 200, 100}, {2, 30}, {300, 50}};
//        int[] bankBalance = {0, 0, 0};
//        for(int i = 0; i < bankDeposit.length; i++){
//            System.out.printf("%d번째 은행 입금 이력은 %s입니다.\n", i, Arrays.toString(bankDeposit[i]));
//            for(int j = 0; j < bankDeposit[i].length; j++){
//                bankBalance[i] += bankDeposit[i][j];
//            }
//        }
//        System.out.println(Arrays.toString(bankBalance));

        // Continue


        scanner.close();
    }
}