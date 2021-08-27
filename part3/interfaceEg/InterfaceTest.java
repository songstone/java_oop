package part3.interfaceEg;

import part3.interfaceEg.Callable;
import part3.interfaceEg.FatherPhone;
import part3.interfaceEg.ParkPhone;

public class InterfaceTest {
    public static void main(String[] args) {
        Callable fp = new FatherPhone();
        System.out.println("아빠는 스마트폰으로 전화를 주로 사용해");
        fp.call("01012345678");
////        fp.instagram(); // 사용 불가
//        SNSable fp2 = (SNSable) fp;
//
//        ParkPhone pp = new ParkPhone();
//        System.out.println("박씨는 스마트폰으로 인스타그램을 주로 사용해");
//        pp.instagram();
//        pp.call("0101111111");
//        pp.description();
//        SNSable sp = new FatherPhone();
//        sp.description();

//        System.out.println(SNSable.instagramId);
//        SNSable.showInfo();
    }
}
