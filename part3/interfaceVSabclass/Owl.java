package part3.interfaceVSabclass;

/**
 * 추상클래스를 상속 받고 인터페이스를 구현한 Owl 클래스
 */
public class Owl extends Bird implements Flyable {

    @Override
    public void tweet() {
        System.out.format("\n%s의 울음소리는 %s..\n", this.getName(), this.getTweetWord());
    }

    @Override
    public void flyable() {
        System.out.println(this.getName()+"는(은) 날 수 있다.");
    }
}
