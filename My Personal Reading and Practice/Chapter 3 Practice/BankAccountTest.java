public class BankAccountTest{
    
    public static void main(String[] args){

    BankAccount account1 = new BankAccount("ugo");
    BankAccount account2 = new BankAccount();
    BankAccount account3 = new BankAccount();
    
    
    
    account1.setName("Matthew Orowusi");
    account2.setName("Matthew Orowusi");
    account3.setName("Matthew Orowusi");    

    System.out.println(account1.getName());
    System.out.println(account2.getName());
    System.out.println(account3.getName());    
    } 
    
}
