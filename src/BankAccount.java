/**
 * Created on 1/06/22
 */

public class BankAccount {
    private int balance;
    private Person owner;

    public void setBalance(int newBalance){
        if(newBalance >= 0){
            balance = newBalance;
        }
    }

    public int getBalance(){ return balance;}

    public Person getOwner(){
        return owner;
    }

    public void setOwner(Person pOwner){
        owner = pOwner;
    }

    // 파라미터 : 입금할 액수 (정수)
    // 리턴 : 성공여부 (불린)

    boolean deposit(int amount) {
        if(amount >= 0 && owner.getCashAmount() > amount) {
            balance += amount;
            owner.setCashAmount(owner.getCashAmount() - amount);

            System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원%n", amount, balance, owner.getCashAmount());
            return true;

        } else {
            System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원%n", balance, owner.getCashAmount());
            return false;
        }
    }

    //파라미터 : 출금할 액수 (정수)
    // 리턴 : 성공 여부(불린)

    boolean withdraw(int amount) {
        if (amount >= 0 && balance > amount) {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);

            System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원%n", amount, balance, owner.getCashAmount());
            return true;
        }
        else {
            System.out.printf("출금 실패입니다. 잔고: %d, 현금: %d원%n", balance, owner.getCashAmount());
            return false;
        }
    }

    // 첫 번째 파라미터 : 받는 사람 (Person)
    // 두 번째 파라미터 : 이체할 금액(정수)
    // 리턴 : 성공여부(불린)

//    boolean transfer(Person to, int amount) {
//
//    }
}
