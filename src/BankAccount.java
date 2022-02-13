/**
 * Created on 1/06/22
 */

public class BankAccount {
    private int balance;
    private Person owner;

    public BankAccount(int balnace){
        if(balnace < 0){
            this.balance = 0;
        } else{
            this.balance = balnace;
        }
    }

    public BankAccount(Person owner){
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(int balance, Person owner){
        if(balance < 0){
            this.balance = 0;
        } else {
            this.balance = balance;
        }
        this.owner = owner;
    }

    public void setBalance(int balance){
        if(balance >= 0){
            this.balance = balance;
        }
    }

    public int getBalance(){ return balance;}

    public Person getOwner(){
        return owner;
    }

    public void setOwner(Person owner){
        this.owner = owner;
    }

    // 파라미터 : 입금할 액수 (정수)
    // 리턴 : 성공여부 (불린)

    public boolean deposit(int amount) {
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

    public boolean deposit(double amount, double exchageRate){
        return deposit((int) (amount * exchageRate));
    }


    //파라미터 : 출금할 액수 (정수)
    // 리턴 : 성공 여부(불린)

    public boolean withdraw(int amount) {
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
    public boolean transfer(BankAccount to, int amount){
        boolean success;

        if(amount < 0 || balance < amount){
            success = false;

        } else{
            balance -= amount;
            to.balance += amount;
            success = true;
        }

        System.out.printf("true - from: %s, to: %s, amount: %d, balance: %d\n", owner.getName(), to.owner.getName(), amount, balance);

        return success;
    }

    public boolean transfer(Person to, int amount){
        return transfer(to.getAccount(), amount);
    }
}

