public class Account
{
    int acc_num;
    int balance;
    String cust_name;
    String email;
    long phone_num;
    public Account(int acc_num, int balance, String cust_name, String email, long phone_num)
    {
        this.balance = balance;
        this.cust_name = cust_name;
        this.email = email;
        this.phone_num = phone_num;
        this.acc_num = acc_num;
    }
    public void deposit(int dep)
    {
        balance += dep; 
        System.out.println("Made a deposit of " + dep + " so now new balance is: " + balance);
    }
    public void withraw(int credit)
    {
        if(balance - credit < 0)
        {
            System.out.println("Insufficient Balance");
            System.exit(0);
        }
        else{balance -= credit;
            System.out.println("Balance = " + balance);
            System.out.println("Name of Account Holder: " + cust_name);}
        
    }
    public void get_details()
    {
        System.out.println("Name of Account Holder: " + cust_name);
        System.out.println("Phone Number of Account Holder: " + phone_num);
        System.out.println("Account Number of Account Holder: " + acc_num);
        System.out.println("Balance of Account Holder: " + balance);
        System.out.println("Email of Account Holder: " + email);
    }
    public int get_balance(){
        return balance;
    }
}