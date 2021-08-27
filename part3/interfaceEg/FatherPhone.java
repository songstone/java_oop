package part3.interfaceEg;

public class FatherPhone implements Callable, SNSable{

    public void call(String phoneNum) {
        System.out.println(phoneNum + " 으로 전화를 겁니다.");
    }

    @Override
    public void instagram() {

    }

    @Override
    public void tiktok() {

    }

    @Override
    public void description(){

    }
}
