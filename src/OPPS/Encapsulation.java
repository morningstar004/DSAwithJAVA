package OPPS;
class Account{
    private double balance;

    //setter
    private void setBalance(double balance){
        if(balance >= 0){
            this.balance = balance;
        }else{
            System.out.println("Error: Balance can not be a negative number.");
        }
    }

    //getter
    private double getBalance(){
        return balance;
    }
}
public class Encapsulation {
    static void main() {
//        Account account = new Account();
        //can't access the variables and method of that class..
//        account.setBalance(6465146);

    }
}
