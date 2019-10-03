import java.util.*;

public class Account
{
    int acc_num;
    int balance;
    String cust_name;
    String email;
    String account_type;
    long phone_num;
    int transac_count = 1;
    int thousand = 1000;
    List transac_history =  new ArrayList<>(); 
    //transac_history.add("Debit: 100 New Balance: 100");
    public Account(int acc_num, int balance, String cust_name, String email, long phone_num, String account_type)
    {
        this.balance = balance;
        this.cust_name = cust_name;
        this.email = email;
        this.phone_num = phone_num;
        this.acc_num = acc_num;
        this.account_type = account_type;
        transac_history.add("Debit: 100 New Balance: 100");
    }
    public void deposit(int dep)
    {
        if(transac_count>3)
            {
                System.out.println("Exceeded the maximum number of transactions allowed");
                System.exit(0);
            }
        if(dep<50 || dep>500)
        {
            System.out.println("Transaction less than 50 and more than 500 are not allowed.");
            System.exit(0);
        }
        balance += dep;
        transac_count++; 
        String a = "Debit: "+ String.valueOf(dep) + " New Balance: " + String.valueOf(balance);
        System.out.println(a);
        transac_history.add(a);
        System.out.println("Made a deposit of " + dep + " so now new balance is: " + balance);
    }
    public void withraw(int credit)
    {
        if(thousand - credit < 0)
        {
            System.out.println("Withrawl greater than 1000 is not allowed");
            System.exit(0);
        }
        if(balance - credit < 0)
        {
            System.out.println("Insufficient Balance");
            System.exit(0);
        }
        else{
            balance -= credit;
            thousand-=credit;
            String a = "Credit: "+ String.valueOf(credit) + " New Balance: " + String.valueOf(balance);
            transac_history.add(a);
            System.out.println("Balance = " + balance);
            System.out.println("Name of Account Holder: " + cust_name);
            System.out.println("The remaining withrawl balance for today is: " + thousand);
        }
        
    }
    public void get_details()
    {
        System.out.println("Name of Account Holder: " + cust_name);
        System.out.println("Phone Number of Account Holder: " + phone_num);
        System.out.println("Account Number of Account Holder: " + acc_num);
        System.out.println("Balance of Account Holder: " + balance);
        System.out.println("Email of Account Holder: " + email);
        System.out.println("Account Type: " + account_type);
        System.out.println("Date and Time for this Trans: " + java.time.LocalDate.now() + "  " + java.time.LocalTime.now()  );
    }
    public void transaction_history()
    {
        System.out.println("Transaction History: " + transac_history);
    }
    public int get_balance(){
        return balance;
    }
}