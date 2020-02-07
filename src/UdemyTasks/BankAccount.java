package UdemyTasks;

public class BankAccount {
    private String  accounNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String  customerPhoneNumber;
    public int getAccounNumber;

    public BankAccount(){
        System.out.println("Empty");
    }

    public BankAccount(String accounNumber, double accountBalance, String customerName, String customerPhoneNumber, String customerEmail){
        System.out.println("Account costractor with parameters called");
        this.accounNumber = accounNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
    }


    public void deposit(double depositAmount){
        this.accountBalance +=depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.accountBalance);
    }

    public void withdrawal(double withdrawalAmount ){
        if (this.accountBalance - withdrawalAmount < 0){
            System.out.println("Only " + this.accountBalance + " aviable. Withdrawal not processed");
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.accountBalance);
        }
    }

    public String getAccounNumber() {
        return accounNumber;
    }

    public void setAccounNumber(String accounNumber) {
        this.accounNumber = accounNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getGetAccounNumber() {
        return getAccounNumber;
    }

    public void setGetAccounNumber(int getAccounNumber) {
        this.getAccounNumber = getAccounNumber;
    }
}
