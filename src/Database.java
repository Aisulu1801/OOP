public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];

    static{
        allAccounts[0] = new CityBankAccount("Ilyas","Zhuanyshev",20000,"KZ00000111", "0102");
        allAccounts[1] = new CityBankAccount("Erbol","Assanbek",10000,"KZ00000112", "0101");
        allAccounts[2] = new NationalBankAccount("Klark Kent",100000,"KZ11100000", "2000");
        allAccounts[3] = new NationalBankAccount("Bruce Wayne",2000000000,"KZ11200000", "8888");
        allAccounts[4] = new NationalBankAccount("Diana Prins",1000000,"KZ11300000", "7845");
        allAccounts[5] = new CityBankAccount("Artur","Karry",200000,"KZ00000113","1154" );
        allAccounts[6] = new CityBankAccount("Barry","Allen",350000,"KZ00000114", "0103");
        allAccounts[7] = new NationalBankAccount("Hell Jordon",200000,"KZ11400000", "8574");
        allAccounts[8] = new CityBankAccount("Jhon", "Jhons",150000,"KZ00000115", "4587");
        allAccounts[9] = new NationalBankAccount("Lex Lutor",1000000000,"KZ11500000", "4561");
    }
}