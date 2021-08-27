package part2;

public class CreditCard {
    String ownerName;  // 소유자명
    String cardID;     // 카드 번호
    int cardLimit;     // 카드 한도
    int membershipFee; // 연회비


    public CreditCard(){}
    public CreditCard(String ownerName, String cardID, int cardLimit, int membershipFee){
        this.ownerName = ownerName;
        this.cardID = cardID;
        this.cardLimit = cardLimit;
        this.membershipFee = membershipFee;
    }


    public String CardInfo(){
        return String.format("소유자명: %s \n카드 번호: %s\n카드 한도: %d\n연회비: %d",
                            ownerName, cardID, cardLimit, membershipFee);
    }
}
