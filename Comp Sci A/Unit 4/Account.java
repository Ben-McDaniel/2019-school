//Ben McDaniel

import java.text.NumberFormat;

public class Account implements Lockable{
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();

    private final double RATE = 0.035;

    private boolean status = true;
    private int key;
    
    private int acctNumber;
    private double balance;
    private String name;

    public double transferTo (Account account, double amount){
        if (status == true){
            withdraw(amount, 0.0);
            account.deposit(amount);    
            return balance;
        } else {
            System.out.println("Failed, method Locked");
            return(0.0);
        }
    }

    public Account (String owner, int account, double initial){
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    public double deposit (double amount){
        if (status == true){
            if (amount < 0){
                System.out.println();
                System.out.println("Error: Deposit amount is invalid.");
                System.out.println(acctNumber + " " + fmt.format(amount));
            } else{
                balance = balance + amount;
            }
            return balance;
        } else {
            System.out.println("Failed, method Locked");
            return(0.0);
        }  
    }


    public double withdraw(double amount, double fee){
        amount += fee;
        if (status == true){
            if (amount < 0){
                System.out.println();
                System.out.println("Error: Withdraw amount is invalid.");
                System.out.println("Requested: " + fmt.format(amount)); 
             } else{
                 if (amount > balance){
                     System.out.println();
                     System.out.println("Error: Insufficent funds.");
                     System.out.println("Account " + acctNumber);
                     System.out.println("Requested: " + fmt.format(amount));
                     System.out.println("Available: " + fmt.format(balance));
                 } else {
                     balance = balance - amount;
                 }
             }
             return balance;
        } else {
            System.out.println("Failed, method Locked");
            return(0.0);
        }

        
    }

    public double addInterest(){
        if (status == true){
            balance += (balance * RATE);
            return balance;
        } else{
            System.out.println("Failed, method Locked");
            return(0.0);
        }
        
    }

    public double getBalance(){
        if (status == true){
            return balance;
        } else{
            System.out.println("Failed, method Locked");
            return(0.0);
        }
    }

    public int getAccountNumber(){
        if (status == true){
            return acctNumber;
        } else{
            System.out.println("Failed, method Locked");
            return(0);
        }
    }

    public String toString(){
        if (status == true){
            return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
        } else{
            return("Failed, method locked");
        }
        
    }








    
    public void setKey(int k){
        if (status == true){
            key = k;
        }
    }

    public String lock(int k){
        if (k == key && status == true){
            status = false;
            return("Locked");
        } else{
            return("Failed");
        }
    }

    public String unlock(int k){
        if (k == key && status == false){
            status = true;
            return("Unlocked");
        } else{
            return("Failed");
        }
    }

    public boolean locked(int k){
        return(status);
    }
}