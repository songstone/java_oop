package part3.interfaceEg;

public class ParkPhone implements SNSable{
    public void call(String phoneNum) {
        System.out.println(phoneNum + "으로 전화를 겁니다.");
    }
    public void instagram() {
        System.out.println("인스타그램 계정:" +instagramId);
    }
    public void tiktok() {
        System.out.println("스마트폰으로 틱톡을 주로 사용해");
    }
}
