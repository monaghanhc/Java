public class BankTester
{
  public static void main(String[] args){
    BankAccount ba = new BankAccount();
    ba.deposit(10); // dad gives you $10
    ba.deposit(400); // you get a job, first month salary = 400
    ba.deposit(400); // second month salary
    System.out.println("Balance so far = " + ba.getBalance());

    // you quit your job...
    ba.withdraw(20); // you buy groceries
    ba.withdraw(700); // maybe an iPhone...?
    System.out.println("Balance after groceries and iphone = " + ba.getBalance() + "\n");

    // you're almost broke, but you're donating money to a friend
    BankAccount friendAcct = new BankAccount();
    ba.transfer(50, friendAcct );
    System.out.println("Balance after transfer = " + ba.getBalance() + "\n");

    CheckingAccount ca = new CheckingAccount(300);
    ca.deposit(30);
    ca.withdraw(150);
    ca.deposit(200);
    ca.deposit(100);
    ca.withdraw(20);
    System.out.println("\nCheckingAccount balance BEFORE fee deduction = " + ca.getBalance());
    // monthly fee deduction
    ca.deductFees();
    System.out.println("CheckingAccount balance AFTER fee deduction = " + ca.getBalance());


    // Test the behaviour of the static variable (but NOT final)
    // numberAccounts which is a static variable inside CheckingAccount:
    CheckingAccount c1 = new CheckingAccount(10);
    CheckingAccount c2 = new CheckingAccount(20);
    CheckingAccount c3 = new CheckingAccount(30);

    c1.numberAccounts = 1;
    System.out.println("\nUpdated numberAccounts in c1: " + c1.numberAccounts);
    System.out.println("Printing numberAccounts from c2: " + c2.numberAccounts);
    System.out.println("Printing numberAccounts from c3: " + c3.numberAccounts);

    c3.numberAccounts++;
    System.out.println("\nUpdated numberAccounts in c3: " + c3.numberAccounts);
    System.out.println("Printing numberAccounts from c1: " + c1.numberAccounts);
    System.out.println("Printing numberAccounts from c2: " + c2.numberAccounts);

    c1.numberAccounts = 1000;
    System.out.println("\nUpdated numberAccounts in c1: " + c1.numberAccounts);
    System.out.println("Printing numberAccounts from c2: " + c2.numberAccounts);
    System.out.println("Printing numberAccounts from c3: " + c3.numberAccounts);

  }

}
