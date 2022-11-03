class Card {
    
    private int balanceAmount, withdrawAmount, cardNumber;
    
    Card (int balanceAmount, int cardNumber) {
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
    
    public void withdrawAmount (int withdrawAmount) {
        this.balanceAmount -= withdrawAmount;
    }
    
    public void calculateBalance() {
        int totalBal = balanceAmount + getBalanceAmount();
        System.out.println("Total Balance: Php " + totalBal + "\n\n----- DEPOSIT SUCCESSFUL -----");
    }
    
    public void withdrawMoney() {
        if (withdrawAmount <= getBalanceAmount()) {
            if (withdrawAmount%100 == 0) {
                int withdrawTransaction = balanceAmount - withdrawAmount;
                System.out.println("\n\n----- WITHDRAWAL REQUEST SUCCESSFUL! -----\nRemaining Balance: Php " + withdrawTransaction + "\n");
            } else System.out.println("\n----- Error! Please try again. -----"); 
        } else System.out.println("\n----- Error! Invalid amount. -----");
    }
}