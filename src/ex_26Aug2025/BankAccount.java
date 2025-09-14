package ex_26Aug2025;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;
    String name;

    BankAccount(String personName, String bankname, String code, int bal){
        this.name = personName;
        this.bankName = bankname;
        this.bankCode = code;
        this.balance = bal;
    }

    BankAccount(){

    }

    void printDetails(){
        System.out.print(name + " ");
        System.out.print(bankName + " ");
        System.out.print(bankCode + " ");
        System.out.print(balance);
    }
}
