import java.util.*;

class Main {
    static Scanner in = new Scanner(System.in);
    static Card card = new Card(1000, 12312);
    static String options = 
        "\nChoose from the following to start transaction.\n" +
        "(1) Exit\n" + 
        "(2) Display Card Information\n" + 
        "(3) Deposit\n" + 
        "(4) Withdraw";
    static int choice, deposit, withdraw;
    
    public static void main(String[] args) {
        startTransaction();
    }
    
    public static void startTransaction() {
        while(true) askUser();
    }

    public static void askUser() {
        System.out.print(options + "\n\nEnter number here (0-3): ");
        choice = in.nextInt();

        switch(choice) {
            case 1 -> { 
                System.out.println("\n----- Program Ends -----");
                System.exit(0);
            }
            case 2 -> {
                System.out.println("\nCard Number: " + card.getCardNumber());
                System.out.println("Balance Amount: Php " + card.getBalanceAmount() + "\n\n----- End of transaction -----");
            }
            case 3 -> { queryBalance(); }
            case 4 -> { queryWithdraw(); }
            default -> { System.out.println("\n----- Wrong input! Please try again. -----"); }
        }
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
    }
}