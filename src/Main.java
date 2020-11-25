public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        WithdrawThread husbandThread = new WithdrawThread("Husband", bankAccount, 15000000);
        WithdrawThread wifeThread = new WithdrawThread("Wife", bankAccount, 20000000);
    }
}
