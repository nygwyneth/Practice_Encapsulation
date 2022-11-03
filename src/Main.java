import java.util.*;

class Main {
    
    static Scanner in = new Scanner(System.in);
    static Card card = new Card(1000, 92621083);
    
    static String options = "\nChoose from the following to start transaction. \n(0) Exit \n(1) Display Card Information \n(2) Deposit \n(3) Withdraw";
    static int choice, deposit, withdraw;
    
    public static void main(String[] args) {
        startTransaction();
    }
    
    public static void startTransaction() {
        askUser();
    }

    public static void askUser() {
        System.out.print(options + "\n\nEnter number here (0-3): ");
        choice = in.nextInt();
        
        if ((choice > 3) || (choice < 0)) System.out.println("\n----- Wrong input! Please try again. -----");
        else if (choice == 0) System.out.println("\n----- End of transaction -----");
        else if (choice == 1) {
            System.out.println("\nCard Number: " + card.getCardNumber());
            System.out.println("Balance Amount: Php " + card.getBalanceAmount() + "\n\n----- End of transaction -----");
        } else if (choice == 2) queryBalance();
        else if (choice == 3) queryWithdraw();
    }
    
    public static void queryBalance() {
        System.out.print("\nEnter Amount to Deposit: Php ");
        deposit = in.nextInt();
        
        card.setBalanceAmount(deposit);
        card.displayBalance();
    }
    
    public static void queryWithdraw() {
        System.out.print("\nEnter Amount to Withdraw: Php ");
        withdraw = in.nextInt();
        
        card.withdrawAmount(withdraw);
        card.withdrawMoney();
    }
}