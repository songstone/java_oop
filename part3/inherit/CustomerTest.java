package part3.inherit;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        /*
        Customer customerWon = new Customer(10010, "원혜린");
//        customerWon.setCustomerName("원혜린");
//        customerWon.setCustomerID(10010);
        customerWon.bonusPoint = 1000;
        System.out.println(customerWon.showCustomerInfo());

        VIPCustomer customerHong = new VIPCustomer(10020, "홍길동");
//        customerHong.setCustomerName("홍길동");
//        customerHong.setCustomerID(10020);
        customerHong.bonusPoint = 10000;
        System.out.println(customerHong.showCustomerInfo());
//
        int basePrice = 1000;
        System.out.printf("가격이 %d원일 때, 일반 고객은 %d원, VIP 고객은 %d원 입니다.", basePrice, customerWon.calcPrice(basePrice), customerHong.calcPrice(basePrice));
        System.out.println(customerWon.calcPrice(1000, 0.02));
        Customer customerKim = new VIPCustomer();
        VIPCustomer kimToVIP = (VIPCustomer)customerKim;
*/
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customerV = new VIPCustomer(10010, "Kim");
        Customer customerG = new GoldCustomer(10020, "Won");
        Customer customerB = new Customer(10030, "Park");

        customers.add(customerV);
        customers.add(customerG);
        customers.add(customerB);

        for(Customer customer: customers){
            System.out.println(customer.showCustomerInfo());
        }
//
//        int price = 10000;
//        for(Customer customer: customers){
//            int cost = customer.calcPrice(price);
//            System.out.printf("%s 등급인 %s님이 지불한 금액은 %d원이고 보너스 포인트는 %d원입니다. \n", customer.getCustomerGrade(), customer.getCustomerName(), cost, customer.bonusPoint);
//        }
    }
}
