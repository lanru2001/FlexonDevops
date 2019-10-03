import Account;
import java.util.*;


public class entrypoint
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Flexon Bank");
        System.out.println("\nHere are your choices \n1.Account Balance\n2.Deposit Money\n3.Withraw Money\n4.Get Details\n5.Exit");
        Account a1 = new Account(1, 100, "Aniket", "aniket@gmail.com", 92343, "Savings");
        int n = sc.nextInt();
        do
        {
            switch(n)
            {
            case 1: System.out.println("Balance is: " + a1.get_balance()); 
                    System.out.println("\nHere are your choices \n1.Account Balance\n2.Deposit Money\n3.Withraw Money\n4.Get Details\n5.Exit");
                    n = sc.nextInt();  
                    break;
            case 2: System.out.println("Enter the amount you want to deposit");
                    int amt = sc.nextInt();  
                    a1.deposit(amt);
                    System.out.println("\nHere are your choices \n1.Account Balance\n2.Deposit Money\n3.Withraw Money\n4.Get Details\n5.Exit");
                    n = sc.nextInt(); 
                    break;
            case 3: System.out.println("Enter the amount you want to withraw");
                    int amt1 = sc.nextInt();  
                    a1.withraw(amt1);
                    System.out.println("\nHere are your choices \n1.Account Balance\n2.Deposit Money\n3.Withraw Money\n4.Get Details\n5.Exit");
                    n = sc.nextInt(); 
                    break;
            case 4: a1.get_details();
                    System.out.println("\nHere are your choices \n1.Account Balance\n2.Deposit Money\n3.Withraw Money\n4.Get Details\n5.Exit");
                    n = sc.nextInt(); 
                    break;
            case 5: System.exit(0);
                    break;
            default: System.out.println("Congratulations for messing with me");
                     System.out.println("\nHere are your choices \n1.Account Balance\n2.Deposit Money\n3.Withraw Money\n4.Get Details\n5.Exit");
                     n = sc.nextInt();
            }
        }
        while(n!= 4);
        
    }
}