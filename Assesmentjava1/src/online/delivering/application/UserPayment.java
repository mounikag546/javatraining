package online.delivering.application;
import static online.delivering.application.DDMV.cartT;


public class UserPayment {
    final static int balance = 1500;


    void onlinePayment() {
        if (balance >= cartT) {
            System.out.println("YOUR ORDER IS SUCCESSFULLY PLACED ");

            System.out.println(" your available balance : " + (balance - cartT));
        } else
            System.out.println("INSUFFICIENT BALANCE ");
    }
}
