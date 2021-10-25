
package assignment1;
public class main {
    public static void main(String[] args) {
        //"2019/10/5","2020/10/5","2021/10/5" are random dates you can add any other dates
        Account a1=new Account(1122, 20000,"2019/10/5");
        a1.updateAnnualInterestRate(4.5);
        System.out.println("Annual interest rate : "+a1.getAnnualInterestRate()+" where your balance : "+a1.getBalance());
        a1.withdraw(2500, "2020/10/5");
        a1.deposit(3000, "2021/10/5");
        System.out.println("Your balance is : "+a1.getBalance());
        System.out.println("Monthly interestrate is : "+a1.getMonthlyInterestRate());
        System.out.println("Account Date created : "+a1.getDateCreated());
    }
    
}
