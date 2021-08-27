package part3.inherit;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        super();
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    @Override
    public String showCustomerInfo() {
        return String.format("%s님의 등급은 %s 이며, 보너스 포인트는 %d원 입니다.랄라라라", customerName, customerGrade, bonusPoint);
    }
}
