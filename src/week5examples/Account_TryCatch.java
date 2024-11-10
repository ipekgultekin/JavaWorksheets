package week5examples;

public class Account_TryCatch {
    private int accountNo;
    private float balance;

    public Account_TryCatch() {
        accountNo = 1;
        balance = 0;
    }

    public Account_TryCatch(int accountNo, float balance) {
        setBalance(balance);
        this.accountNo = accountNo;

    }

    public void withdraw(float amount) {
        if(amount > balance) {
            return;
        }
        else{
            balance = balance - amount;

        }
        System.out.println("Insufficient amount");
    }

    public void deposit(float amount) {
        balance = balance + amount;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float newBalance) throws IllegalArgumentException{
            if(newBalance > 0)
                balance = newBalance;
            else
                throw new IllegalArgumentException("Balance can not be negative");
        }


    @Override
    public String toString() {
        return "Account_TryCatch{" +
                "accountNo=" + accountNo +
                ", balance=" + balance +
                '}';
    }
}
