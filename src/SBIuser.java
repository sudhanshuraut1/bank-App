import java.util.Objects;
import java.util.UUID;

public class SBIuser implements BankInterface{

    //attributes

    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private static double rateOfInterest;

    //constructor;
    public SBIuser(String name,double balance,String password){
        // provided by user
        this.name = name;
        this.balance = balance;
        this.password = password;

        // bank is initialising
        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIuser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double chechBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;
        return "Your new balance is"+ balance;

    }

    @Override
    public String withdrawMoney(int amount, String enteredpassword) {
        if(Objects.equals(enteredpassword,password)){
               if(amount> balance){
                   return " Insufficient funds";
               }
               else{
                   balance = balance-amount;
                   return "Katori aage krk paisa le";
               }
        }
        else{
            return "Wrong Password";
        }


    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
