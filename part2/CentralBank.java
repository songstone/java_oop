package part2;

public class CentralBank {
    private static CentralBank instance = new CentralBank();
//    private static CentralBank instance;

    private CentralBank(){}

    public static CentralBank getInstance(){
        if(instance == null){
            instance = new CentralBank();
        }
        return instance;
    }

    // Lazy Initialization. DCL
//    private volatile static CentralBank instance;
//
//    private CentralBank() {}
//
//    public CentralBank getInstance() {
//        if(instance == null) {
//            synchronized(CentralBank.class) {
//                if(instance == null) {
//                    instance = new CentralBank();
//                }
//            }
//        }
//        return instance;
//    }
}
