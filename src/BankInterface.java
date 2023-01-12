public interface BankInterface {

    double chechBalance();
    String addMoney(int amount);
     String withdrawMoney(int amount,String password);
     double calculateInterest(int years);

}
