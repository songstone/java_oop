package part3.interfaceVSabclass;

/**
 * 추상클래스를 상속 받은 Chicken 클래스
 */
public class Chicken extends Bird{

    @Override
    public void tweet() {
        System.out.format("\n%s의 울음소리는 %s~~\n", this.getName(), this.getTweetWord());
    }
}