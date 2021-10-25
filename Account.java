
package assignment1;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private String dateCreated;
    private String depositeDate;
    private String withdraweDate;
    public Account(){
        id=0;
        balance=0;
        annualInterestRate=0;
    }
    public Account(int id,double balance,String dateCreated){
        this.id=id;
        this.balance=balance;
        this.dateCreated=dateCreated;
        depositeDate=dateCreated;
    }
    public void updateId(int id){
        this.id=id;
    }
    public void updateBalance(double newBalance){
        balance=newBalance;
    }
    public void updateAnnualInterestRate(double annualInterrestRate){
        this.annualInterestRate=annualInterrestRate;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate/100*balance;
    }
    public double getMonthlyInterestRate(){
        return getAnnualInterestRate()/12;
    }
    public String getDateCreated(){
        return dateCreated;
    }
    public void withdraw(double ammount,String date){
        withdraweDate=date;
        balance+=getAnnualInterestRate()*depositPeriod();
        if(balance>=ammount)
        {
            balance-=ammount;
        }
        else
            System.out.println("You do not have enough balance to withdraw");
    }
    public void deposit(double ammount,String date)
    {
        depositeDate=withdraweDate;
        withdraweDate=date;
        balance+=ammount+getAnnualInterestRate()*depositPeriod();
    }
    public double depositPeriod()
    {
        String[]d1;
        String[]d2;
        d1=depositeDate.split("/");
        d2=withdraweDate.split("/");
        double d1Days=Integer.parseInt(d1[0])*360+Integer.parseInt(d1[1])*30+Integer.parseInt(d1[2]);
        double d2Days=Integer.parseInt(d2[0])*360+Integer.parseInt(d2[1])*30+Integer.parseInt(d2[2]);
        return (d2Days-d1Days)/360;
    }
}
