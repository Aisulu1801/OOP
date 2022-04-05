public class NationalBankAccount implements BankAccount{
    String fullName;
    int balance;
    String accountNumber;
    String pinCode;

    public NationalBankAccount(){}
    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getBalance() {
        System.out.println("Текущий баланс: ");
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public String getPinCode() {
        return pinCode;
    }
    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return 0;
    }
    @Override
    public void creditBalance(int credit) {
        if(balance>credit){
            balance=balance-credit-200;
            System.out.println("На вашем счету с учетом комиссии: "+balance);
        }else {
            System.out.println("Не достаточно средств");
        }
    }
    @Override
    public void debetBalance(int debet) {
        balance=balance+debet;
        System.out.println("На вашем счету: "+balance);
    }
    @Override
    public String accountData() {
        return "FullName: "+fullName+" "+"AccountNumber: "+accountNumber;
    }


}