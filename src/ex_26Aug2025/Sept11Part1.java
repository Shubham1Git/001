package ex_26Aug2025;

public class Sept11Part1 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Shubham", "SBI", "SBI001", 4000 );
        System.out.println(ba1.name + " has bank account in " + ba1.bankName + " having IIFCS code of " + ba1.bankCode +". Current balance = " + ba1.balance);
    }
}
