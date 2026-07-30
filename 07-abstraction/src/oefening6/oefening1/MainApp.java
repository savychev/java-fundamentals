package oefening6.oefening1;

public class MainApp {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        System.out.println(bankA.getBalance());

        Bank bankB = new BankB();
        System.out.println(bankB.getBalance());

        Bank bankC = new BankC();
        System.out.println(bankC.getBalance());
    }
}
