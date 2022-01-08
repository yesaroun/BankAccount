public class BankDriver {
    public static void main(String[] args){
        // 사람 선언
        Person p1 = new Person();
        p1.name = "김땡땡";
        p1.age = 28;
        p1.cashAmount = 30000;

        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.balance = 100000;

        p1.account = a1;
        a1.owner = p1;

        Person p2 = new Person();
        p2.name = "이땡땡";
        p2.age = 26;
        p2.cashAmount = 100000;

        BankAccount a2 = new BankAccount();
        a2.balance = 500000;

        p2.account = a2;
        a2.owner = p2;


        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));

//        System.out.println(p1.account.balance);
//        System.out.println(a1.owner.name);
    }
}
