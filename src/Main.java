public class Main {
    public static void main(String[] args){

        Person p1 = new Person("김신의", 28);
        p1.setCashAmount(30000);

        Person p2 = new Person("문중모", 30, 100000);

        BankAccount a1 = new BankAccount(p1);
        a1.setBalance(100000);
        p1.setAccount(a1);

        BankAccount a2 = new BankAccount(500000, p2);
        p2.setAccount(a2);

        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}
