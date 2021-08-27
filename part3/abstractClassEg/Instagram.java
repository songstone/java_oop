package part3.abstractClassEg;

class Instagram extends SNS {
    String defaultUploadFileType = "image";
    void login() { System.out.println("인스타그램에 로그인되었습니다.");}
    void upload(String uploadFileType){
        if(!uploadFileType.equals(defaultUploadFileType)){
            System.out.println("(에러) 이미지만 업로드 가능합니다.");
        }else{
            System.out.println("정상적으로 업로드 되었습니다.");
        }
    }


}