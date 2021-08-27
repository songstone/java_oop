package part2;

public class ConstructorTest {
    public static void main(String[] args){
        CreditCard card1 = new CreditCard();

        // 멤버 변수 각각 넣기
        card1.cardID = "11211";
        card1.ownerName = "원혜린";
        card1.cardLimit = 20000;
        card1.membershipFee = 10000;

        System.out.println(card1.CardInfo());
        /*
        card1.ownerName = "패스트캠퍼스";
        card1.cardID = "1";
        card1.cardLimit = 300000;
        card1.membershipFee = 10000;ㅌ
        System.out.println(card1.CardInfo());
         */

        // 생성자 이용하여 초기화

        CreditCard card2 = new CreditCard("원혜린", "2", 10000, 100);
        System.out.println(card2.CardInfo());

    }
}
