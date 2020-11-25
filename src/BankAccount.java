public class BankAccount {

    public static long amount;

    public BankAccount(){
        amount = 20000000;
    }

    public static synchronized void withdraw(String threadName, long withdrawAmount){
        System.out.println(threadName);
        System.out.println(withdrawAmount);
        if(withdrawAmount > amount){
            System.out.println("Can not withdraw this amount! Balance: " + amount);
        }else{
            amount = amount - withdrawAmount;
            System.out.println("Withdraw success! Balance: " + amount);
        }
    }
}
