class Card {
    
    private int balanceAmount, withdrawAmount, cardNumber;
    
    public int getBalanceAmount() {
        return balanceAmount = 1000;
    }
    
    public int getWithdrawAmount() {
        return withdrawAmount;
    }
    
    public int getCardNumber() {
        return cardNumber = 92621083;
    }
    
    public void setBalanceAmount (int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
    
    public void setWithdrawAmount (int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
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
            } else {
            System.out.println("\n----- Error! Please try again. -----");
            }
        } else {
            System.out.println("\n----- Error! Invalid amount. -----");
        }
    }
}