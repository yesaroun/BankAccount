/**
 * Created on 1/06/22
 */
public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String name, int age){
        this.name = name;
        if(age < 0){
            this.age = 12;
        } else
            this.age = age;
        cashAmount = 0;
    }

    public Person(String name, int age, int cashAcount){
        this.name = name;
        if(age < 0){
            this.age = 12;
        } else
            this.age = age;

        if(cashAcount < 0){
            this.cashAmount = 0;
        }
        else {
            this.cashAmount = cashAcount;
        }
    }

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
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // 현금
    public void setCashAmount(int cashAmount){
        if(cashAmount >=0){
            this.cashAmount = cashAmount;
        }
    }

    public int getCashAmount(){
        return cashAmount;
    }

    // 계좌
    public BankAccount getAccount(){
        return account;
    }

    public void setAccount(BankAccount account){
        this.account = account;
    }

    public boolean transfer(Person to, int amount){
        return account.transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount){
        return account.transfer(to, amount);
    }

}
