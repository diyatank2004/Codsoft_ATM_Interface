package Task3;
import java.util.Scanner;
public class ATM_interface
{
    public static char d;
    public static int CVV=567;
    public int AC_No=123456789;
    public double balance=10000;
    Scanner sc=new Scanner(System.in);
    public void withdraw()
    {
        System.out.println("Enter Amount to withdraw : ");
        double amount=sc.nextDouble();
        if(balance>=amount && amount<=5000)
        {
            balance=balance-amount;
            System.out.println("Transaction Successful.");
            System.out.println("Please collect your money.");
        }
        else
        {
            System.out.println("Cannot withdraw more than 5000!!");
        }
        System.out.println("Your Account Balance is Rs "+balance);
        sc.close();
    }
    public void deposit() 
    {
        System.out.println("Enter Amount to deposit : ");
        double amount=sc.nextDouble();
        
        if(amount<=5000)
        {
            balance=balance+amount;
            System.out.println("Transaction Successful.");
        }
        else
        {
            System.out.println("Cannot Deposit Amount more than 5000 at once!!");
        }
        System.out.println("Your Account Balance is Rs "+balance);
        sc.close();
    }
    public void checkBalance()
    {
        System.out.println("Enter Account number:");
        int ac_no=sc.nextInt(); 
        if(AC_No==ac_no)
        {
            System.out.println("Your Bank Balance is Rs "+balance);
        }
        else
        {
            System.out.println("Invalid Account Number!!!");
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
    
        ATM_interface a1=new ATM_interface();
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("**********Welcome to State Bank of India**********");
        System.out.println("Please insert Your Card.");
        System.out.println("Please enter your CVV : ");
        int cvv=sc.nextInt();
        if(cvv==CVV)
        {
        System.out.println("Choose from below options. ");
        System.out.println("");
        System.out.println("1.Withdraw Amount\t\t2.Deposit Amount\n3.Check Account Balance\t\t4.Exit");
        choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                a1.withdraw();
                break;
            
            case 2:
                a1.deposit();
                break;

            case 3:
                a1.checkBalance();
                break;

            case 4:
                System.exit(0);
                break;
        
            default:System.out.println("Wrong choice entered !! Try Again");
                break;
        }
        }
    }
} 
