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

    }

    @Override
    public double chechBalance() {
        return 0;
    }

    @Override
    public String addMoney(int amount) {
        return null;
    }

    @Override
    public String withdrawMoney(int amount, String password) {
        return null;
    }

    @Override
    public double calculateInterest(int years) {
        return 0;
    }
}
