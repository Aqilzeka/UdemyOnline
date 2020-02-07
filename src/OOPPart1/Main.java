package OOPPart1;

public class Main   {

    public static void main(String[] args) {
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Aqil", 25000.00);
        System.out.println(vipCustomer2.getName());

        VipCustomer vipCustomer3 = new VipCustomer("Zeka", 100.00, "zeka@gmail.com");
        System.out.println(vipCustomer3.getName());

    }

}
