public class ClassesChallenge {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount(123456, 20000, "Sebastian", "sebascarvu@gmail.com", 314671520);
        ba.depositFunds();
        ba.withdrawFunds();
        System.out.println("Balance: $" + ba.getBalance());

    }

}
