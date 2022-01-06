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

        System.out.println(p1.account.balance);
        System.out.println(a1.owner.name);
    }
}
