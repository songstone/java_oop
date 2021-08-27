package part2;

public class CentralBankTest {
    public static void main(String[] args) {
        CentralBank bank1 = CentralBank.getInstance();
//        CentralBank bank2 = new CentralBank();
        CentralBank bank3 = CentralBank.getInstance();

        System.out.println(bank1);
        System.out.println(bank3);
        System.out.println(bank1 == bank3);
        System.out.println(bank1.equals(bank3));

    }
}
