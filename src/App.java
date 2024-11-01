import Encapsulation.BankAccount;

public class App {
    public static void main(String[] args) {
        // What is OOP?
        // OOP is building the codes how you build things in real world
        // It is more focused on Objects rather than Functions.
        // Major core feature is of OOP is reusablity of codes and Maintainability.
        // Encapsulation, Inheritance, Polymorphism, Abstraction

        BankAccount AccOne = new BankAccount("Ye Yint Yan Aung");
        AccOne.deposit(100);
        System.out.println(AccOne.getBalance());
        
        BankAccount AccThree = new BankAccount("Wai Yan Linn Aung");
        System.out.println(AccThree.getAccName());


        BankAccount AccTwo = new BankAccount("Kaung Pyae Sone Aung");
        System.out.println(AccTwo.getAccName()+" balance is "+AccTwo.getBalance());
    }
}
