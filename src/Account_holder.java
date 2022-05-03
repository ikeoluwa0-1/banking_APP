public class Account_holder {
        String accountName;
        double balance;
        double previousTransaction;
        String loginPin;


        Account_holder(String idName, String customerId){
            String accountName = idName;
            String loginPin = customerId;
        }
        void deposit (double amount){
            if (amount!= 0){
                balance = balance + amount;
                previousTransaction = amount;
            }
        }
        void withdraw (int amount) {
            if (amount != 0) {
                balance = balance - amount;
                previousTransaction = amount;
            }
        }

         void PreviousTransaction (){
                if (previousTransaction > 0){
                    System.out.println("You deposited" + (previousTransaction));
                } else if (previousTransaction < 0) {
                    System.out.println("You withdrew" + (previousTransaction));
                }
                      System.out.println("No Transaction Occurred");
        }
        
    @Override
    public String toString() {
        return "Account_holder{" +
                "accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", previousTransaction='" + previousTransaction + '\'' +
                ", loginPin='" + loginPin + '\'' +
                '}';
    }
}

