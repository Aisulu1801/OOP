import java.util.Scanner;

public class CityBankATM{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Account: ");
        String accountNumber = in.next();
        System.out.println("Enter PIN CODE: ");
        String pin = in.next();
        int choice = 0;
        for (int i = 0; i < 10; i++){
            if (accountNumber.equals(Database.allAccounts[i].getAccountNumber()) && pin.equals(Database.allAccounts[i].getPinCode())){
                if (Database.allAccounts[i] instanceof CityBankAccount){
                    boolean exit = false;
                    while (true){
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                        System.out.println("PRESS [2] TO VIEW BALANCE");
                        System.out.println("PRESS [3] TO CHANGE PIN CODE");
                        System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                        System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                        System.out.println("PRESS [6] TO EXIT");

                        choice = in.nextInt();
                        if (choice == 1){
                            System.out.println("Vvedite summu:");
                            Database.allAccounts[i].creditBalance(in.nextInt());
                            System.out.println("Vash balans: " + ((CityBankAccount) Database.allAccounts[i]).getBalance());
                        } if(choice == 2){
                            System.out.println("Vash balans: " + ((CityBankAccount) Database.allAccounts[i]).getBalance());
                        } if (choice == 3){
                            System.out.println("Vvedite PIN");
                            pin = in.next();
                            Database.allAccounts[i].setPinCode(pin);
                            System.out.println("Vash PIN obnovlen");
                        } if (choice == 4){
                            System.out.println("Vvedite summu, kotoruyu hotite dobavit': ");
                            int debet = in.nextInt();
                            Database.allAccounts[i].debetBalance(debet);
                            System.out.println("Vash balans: " + ((CityBankAccount) Database.allAccounts[i]).getBalance());
                        } if(choice == 5){
                            System.out.println(  Database.allAccounts[i].accountData());
                        }       if(choice == 0){
                            exit = true;
                        }
                        if (exit)
                            break;
                    }
                } else{

                    boolean exit = false;

                    while (true){
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL" +
                                " " +
                                "PRESS [2] TO VIEW BALANCE" +
                                " " +
                                "PRESS [3] TO EXIT");
                        choice = in.nextInt();
                        if (choice == 1){
                            System.out.println("Vvedite summu, kotoruyu khotite dobavit'");
                            Database.allAccounts[i].creditBalance(in.nextInt());
                            System.out.println("Teper' vash balans: " + Database.allAccounts[i].totalBalance());

                        } if(choice == 2){
                            System.out.println("Vash balans: " + Database.allAccounts[i].totalBalance());
                        }  if(choice == 3){
                            exit = true;
                        }
                        if (exit) break;
                    }
                }
            }
        }
    }
}