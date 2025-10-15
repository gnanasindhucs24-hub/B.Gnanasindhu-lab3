
import java.util.Scanner;
class Account{
    private int accountNumber;
    private  double balance;
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        if(balance>0){
            this.balance=balance;
        }
        else
        {
            System.out.println("Invalid");
        }
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void displayaccountdetails(){
        System.out.println("Account no:"+accountNumber);
        System.out.println("\nBalance:"+balance);
    }
}
public class AccountDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Account acc=new Account();
        System.out.println("Enter the account number");
        int accountNumber=sc.nextInt();
        acc.setAccountNumber(accountNumber);
        System.out.println("\nenter balance");
        double bal=sc.nextDouble();
        acc.setBalance(bal);
        System.out.println("\naccount details");
        acc.displayaccountdetails();
        System.out.println("\nupdate balance");
        System.out.println("enter newbalance");
        double newbal=sc.nextDouble();
        acc.setBalance(newbal);
        System.out.println("\nupdated account");
        acc.displayaccountdetails();
        sc.close();
    }
}



    
