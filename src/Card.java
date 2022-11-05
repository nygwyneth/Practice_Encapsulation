class Card {
    private int balanceAmount, withdrawAmount, cardNumber;
    
    Card(int balanceAmount, int cardNumber) {
        this.balanceAmount = balanceAmount;
        this.cardNumber = cardNumber;
    }

    public int getBalanceAmount() {
        return balanceAmount;
    }
    
    public int getWithdrawAmount() {
        return withdrawAmount;
    }
    
    public int getCardNumber() {
        return cardNumber;
    }
    
    public void setBalanceAmount (int balanceAmount) {
        this.balanceAmount += balanceAmount;
    }

    public void displayBalance() {
        System.out.println("Total Balance: Php " + balanceAmount + "\n\n----- DEPOSIT SUCCESSFUL -----");
    }
    
    public void withdrawAmount(int withdrawAmount) {
        if (withdrawAmount <= balanceAmount && withdrawAmount % 100 == 0) {
            this.balanceAmount -= withdrawAmount;
            System.out.println("----- WITHDRAWAL REQUEST SUCCESSFUL -----");
            System.out.println("Remaining Balance: Php " + balanceAmount);
        } else System.out.println("\n----- Invalid input! Please try again. -----");
    }
}