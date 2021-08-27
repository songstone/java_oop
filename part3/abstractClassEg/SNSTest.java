package part3.abstractClassEg;

public class SNSTest {
    public static void main(String[] args) {
        Instagram i = new Instagram();
        i.login();
        i.upload("image");
        Tiktok tt = new Tiktok();
        tt.login();
        tt.upload("image");
        tt.upload("video");

    }
}