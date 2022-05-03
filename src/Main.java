import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your Login pin: ");
        Scanner digit = new Scanner(System.in);
        String name = digit.nextLine();
    }
//    void deposit (int amount){
//        if (amount!= 0){
//            balance = balance + amount;
//            previousTransaction = amount;
//        }
//    }
//    void withdraw (int amount){
//        if (amount!= 0){
//            balance = balance - amount;
//            previousTransaction = amount;
//        }
//        void getPreviousTransaction(){
//            if (previousTransaction > 0){
//                System.out.println("You deposited" + (previousTransaction));
//                 else if (previousTransaction < 0){
//                    System.out.println("You withdrew" + (previousTransaction));
//                  else {
//                        System.out.println("No Transaction Occurred");
//                    }
//                }
//            }
//        }
//    }
}

