package part3.abstractClassEg;

class Tiktok extends SNS {
    String defaultUploadFileType = "video";
    void login() { System.out.println("틱톡에 로그인되었습니다.");}
    @Override
    void upload(String uploadFileType){
        if(!uploadFileType.equals(defaultUploadFileType)){
            System.out.println("(에러) 비디오만 업로드 가능합니다.");
        }else{
            System.out.println("정상적으로 업로드 되었습니다.");
        }
    }
}