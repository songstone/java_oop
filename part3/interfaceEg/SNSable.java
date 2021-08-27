package part3.interfaceEg;

public interface SNSable {
    String instagramId = "myId";
    void instagram();
    void tiktok();
    default void description(){
        System.out.println("SNS 인터페이스를 구현합니다.");
    };

    static void showInfo(){
        System.out.println("오늘 날씨는 맑음");
    };
}
