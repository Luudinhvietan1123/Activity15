public class WithdrawThread implements Runnable{

    public WithdrawThread(String threadName, BankAccount bankAccount, long withdrawAmount){
        Thread t = new Thread(this);
        BankAccount.withdraw(threadName, withdrawAmount);
        t.start();
    }

    public void run(){
    }
}
