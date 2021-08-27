package part3.abstractClassEg;

import java.util.AbstractMap;
import java.util.HashMap;

abstract class SNS{
    String defaultUploadFileType = "";
    void login() { System.out.println("로그인 되었습니당!");}
    abstract void upload(String uploadFileType);

    final void startApp(){
        String uploadFileType = "image";
        login();
    }
}