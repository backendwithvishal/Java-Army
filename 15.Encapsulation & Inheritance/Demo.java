public class Demo {
    public static void main(String[]args ){
        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.withdraw(750);

        System.out.println(ba.getBalance());;
    }
}

class BankAccount {
    private double balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String collage;

    // Constructor
    Student(String name, int rollNumber, int age, String Collage) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.collage = collage;
    }

    // Getter & Setter
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCollage(){
        return collage;
    }

    public void getCollage(String collage) {
        this.collage = collage;
    }
}