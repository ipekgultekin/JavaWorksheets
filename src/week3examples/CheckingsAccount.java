package week3examples;

/**
 * Class to represent checkings account
 */
public class CheckingsAccount extends Account {
    private int overDraftLimit;

    public CheckingsAccount(int accountNo, float balance, int overDraftLimit) {
        super(accountNo, balance);
        this.overDraftLimit = overDraftLimit;
    }

    /**
     * simple method to perform wwithdrawn with overdraft
     * @param amount amount to be withdrawn
     */


    public void withdraw(float amount) {
        float overDraft = 0;
        if(amount > getBalance()){
            overDraft = amount - getBalance();
            if(overDraft > overDraftLimit){
                return;
            }
            else{
                setBalance(getBalance()-amount);
            }
            return;
        }

        else{
            setBalance(getBalance()-amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingsAccount{" +
                "accountNo = " + getAccountNo() +
                "balance = " + getBalance() +
                "overDraftLimit=" + overDraftLimit +
                '}';
    }
}
