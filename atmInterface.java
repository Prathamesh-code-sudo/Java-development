public class atmInterface {
    public static void displayBalance(int balance) {
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }

    public static int amountWithdrawing(int balance, int withdrawAmount) {
        System.out.println("Withdraw Operation: ");
        System.out.println("Withdraw amount: " + withdrawAmount);

        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your cash and card");
            displayBalance(balance);
        } else {
            System.out.println("Sorry!! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }

    public static int amountDepositing(int balance, int depositAmount) {
        System.out.println("Deposit Operation ");
        System.out.println("Depositing amount: " + depositAmount);
        balance = balance + depositAmount;
        System.out.println("Your money has been deposited successfully");
        displayBalance(balance);
        return balance;
    }

    public static void main(String[] args) {
        int balance = 10000;
        int withdrawAmount = 5000;
        int depositAmount = 2000;

        displayBalance(balance);
        balance = amountWithdrawing(balance, withdrawAmount);

        balance = amountDepositing(balance, depositAmount);
    }

}
