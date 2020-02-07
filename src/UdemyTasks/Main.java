package UdemyTasks;

public class Main {
    public static void main(String[] args) {
        BankAccount aqilAccount = new BankAccount();

        aqilAccount.setAccounNumber("08974748543");
        aqilAccount.setAccountBalance(0.0);
        aqilAccount.setCustomerEmail("aqilzeka99@gmail.com");
        aqilAccount.setCustomerName("Aqil Zeka");
        aqilAccount.setCustomerPhoneNumber("(+994) 70 814 43 14");

        System.out.println("____________________________________________________________");
        System.out.println("Customer's account number: " + aqilAccount.getAccounNumber());
        System.out.println("Customer's account name: " + aqilAccount.getCustomerName());
        System.out.println("Customer's account balance: " + aqilAccount.getAccountBalance());
        System.out.println("Customer's account Phone number: " + aqilAccount.getCustomerPhoneNumber());
        System.out.println("Customer's account Email: " + aqilAccount.getCustomerEmail());
        System.out.println("_____________________________________________________________");
        System.out.println("\n");

        aqilAccount.withdrawal(100.0);
        aqilAccount.deposit(50.0);
        aqilAccount.withdrawal(100.0);
        aqilAccount.deposit(51.0);
        aqilAccount.withdrawal(100.0);
    }
}
