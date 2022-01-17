/**
 * Created on 1/06/22
 */
public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    // 나이
    public void setAge(int newAge){
        if(newAge >= 0){
            age = newAge;
        }
    }

    public int getAge(){
        return age;
    }

    // 이름
    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    // 현금
    public void setCashAmount(int newCashAmount){
        if(newCashAmount >=0){
            cashAmount = newCashAmount;
        }
    }

    public int getCashAmount(){
        return cashAmount;
    }

    // 계좌
    public BankAccount getAccount(){
        return account;
    }

    public void setAccount(BankAccount pAccount){
        account = pAccount;
    }

    public boolean transfer(Person to, int amount){
        return account.transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount){
        return account.transfer(to, amount);
    }

}
