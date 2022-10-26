class Card {
    
    private int balanceAmount, withdrawAmount, cardNumber;
    private int defaultMoney = 1000;
    
    public int getBalanceAmount() {
        return balanceAmount = 1000;
    }
    
    public int getWithdrawAmount() {
        return withdrawAmount;
    }
    
    public int getCardNumber() {
        return cardNumber = 92621083;
    }
    
    public void setBalanceAmount (int newBalanceAmount) {
        balanceAmount = newBalanceAmount;
    }
    
    public void setWithdrawAmount (int newWithdrawAmount) {
        withdrawAmount = newWithdrawAmount;
    }
    
    public void calculateBalance() {
        int totalBal = defaultMoney + balanceAmount;
        System.out.println("Total Balance: Php " + totalBal + "\n\n----- DEPOSIT SUCCESSFUL -----");
    }
    
    public void withdrawMoney() {
        if (withdrawAmount <= getBalanceAmount()) {
            if (withdrawAmount%100 == 0) {
                int withdrawTransaction = balanceAmount - withdrawAmount;
                System.out.println("\n\n----- WITHDRAWAL REQUEST SUCCESSFUL! -----\nRemaining Balance: Php " + withdrawTransaction);
            } else {
            System.out.println("Error! Please try again.");
            }
        } else {
            System.out.println("Error! Invalid amount.");
        }
    }
}