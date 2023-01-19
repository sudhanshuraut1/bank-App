import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name,password and balance to create an account");

        // create user
        String name = sc.nextLine();
        String password = sc.next();
        double balance = sc.nextDouble();
        SBIuser user = new SBIuser(name,balance,password);

        // add amount
      String message = user.addMoney(10000);
        System.out.println(message);

        // withdraw money
        System.out.println("Enter amount you wanna withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        //ROI
        System.out.println(user.calculateInterest(10));
    }
}