public class BankDriver {
    public static void main(String[] args){
        // 사람 선언
        /*
        Person p1 = new Person();
        p1.setName("김땡땡");
        p1.setAge(28);
        p1.setCashAmount(30000);
         */

        Person p1 = new Person("김땡땡", 28, 30000);

        Person p2 = new Person("이땡땡", 25);


        // 은행 계좌 생성
        BankAccount a1 = new BankAccount(p1);
        a1.setBalance(100000);

        BankAccount a2 = new BankAccount(500000, p2);
        a2.setBalance(500000);


        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);

        a2.transfer(a1, 200000);
        a1.transfer(a2, 150000);
        p2.transfer(p1, 270000);
        p1.transfer(p2, 130000);

    }
}
