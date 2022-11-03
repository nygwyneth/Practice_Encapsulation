class Card {
    
    private int balanceAmount, withdrawAmount, cardNumber;
    
    Card (int balanceAmount, int cardNumber) {
        this.balanceAmount = balanceAmount;
        this.cardNumber = cardNumber;
    }

    public int getBalanceAmount() {
        System.out.println("Total Balance: Php " + balanceAmount + "\n\n----- DEPOSIT SUCCESSFUL -----");
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
    
    public void withdrawMoney() {
        if (withdrawAmount <= balanceAmount) {
            if (withdrawAmount%100 == 0) System.out.println("\n\n----- WITHDRAWAL REQUEST SUCCESSFUL! -----\nRemaining Balance: Php " + balanceAmount + "\n");
            else System.out.println("\n----- Error! Please try again. -----"); 
        } else System.out.println("\n----- Error! Invalid amount. -----");
    }
}