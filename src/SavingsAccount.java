class SavingsAccount extends BankAccount {
    private double limits;
    private double overDraft;
    public SavingsAccount( int accountNumber, double balance){
        super(accountNumber,balance);
        this.limits = 5;
        this.overDraft = -1000.0;
    }

    public double getLimits() {
        return limits;
    }

    public void setLimits(double limits) {
        this.limits = limits;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    @Override
    public double withdraw(double amount){
        return 0;
    }
    @Override
    public double deposit(double amount){
        setBalance(amount);
        return getBalance();
    }
}
