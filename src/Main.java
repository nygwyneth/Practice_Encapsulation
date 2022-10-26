import java.util.*;

class Main {
    
    static Scanner in = new Scanner(System.in);
    static Card card = new Card();
    static Main main = new Main();
    
    String options = "\n(0) Exit \n(1) Display Card Information \n(2) Deposit \n(3) Withdraw";
    int choice, deposit, withdraw;
    
    public static void main(String[] args) {
        main.startTransaction();
    }
    
    public void startTransaction() {
        System.out.println("\nChoose from the following to start transaction." + options + "\n");
        System.out.print("Enter number here (0-3): ");
        choice = in.nextInt();
        
        if ((choice > 3) || (choice < 0)) {
            System.out.println("Wrong input! Please try again.");
        } else if (choice == 0) {
            System.out.println("\n----- End of transaction -----");
        } else if (choice == 1) {
            System.out.println("\nCard Number: " + card.getCardNumber());
            System.out.println("Balance Amount: Php " + card.getBalanceAmount() + "\n\n----- End of transaction -----");
        } else if (choice == 2) {
            main.balance();
        } else if (choice == 3) {
            main.withdraw();
        }
    }
    
    public void balance() {
        System.out.print("\nEnter Amount to Deposit: Php ");
        deposit = in.nextInt();
        
        card.setBalanceAmount(deposit);
        card.calculateBalance();
    }
    
    public void withdraw() {
        System.out.print("\nEnter Amount to Withdraw: Php ");
        withdraw = in.nextInt();
        
        card.setWithdrawAmount(withdraw);
        card.withdrawMoney();
    }
}