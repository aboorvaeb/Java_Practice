package oop;

public class account {
private String acc_number;
private double balance;
private String cus_name;
private String email;
private String phone_no;

public void deposit(double dep_amount)
{
    this.balance = dep_amount+this.balance;
    System.out.println("total balance"+this.balance);
}
public void withdraw(double with_amount)
{
    if(this.balance - with_amount <0){
        System.out.println( "Insufficient, available balance ="+this.balance);

    }
   else {

        this.balance-=with_amount;
        System.out.println("Remaining balance"+this.balance);
    }
}

    public String getAcc_number() {
        return acc_number;
    }

    public void setAcc_number(String acc_number) {
        this.acc_number = acc_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}

