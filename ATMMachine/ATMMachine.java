package ATMMachine;

import java.util.Scanner;

class ATM{
    float Balance;// variables taken
    int pin=1234;//variables
    public void checkpin(){ // method
        System.out.println("Enter your PIN:");
        Scanner scn = new Scanner(System.in);
        int enterpin=scn.nextInt();
        if(enterpin==pin) {
            menu();
        }
        else {
            System.out.println("Enter a  valid pin");
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check Your A/C Balanced");
        System.out.println("2. WithDraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner scn = new Scanner(System.in);
        int options = scn.nextInt();
        if(options==1){
            checkBalance();
        } else if (options==2) {
            withdrawMoney();
        } else if (options==3) {
            depositMoney();
        }
        else if (options==4){
           return;
        }
        else {
            System.out.println("Enter a valid choice");
        }
    }
   public void checkBalance(){
       System.out.println("Balance:" +Balance);
       menu();
   }
   public void withdrawMoney(){
       System.out.println("Enter Amount to WithDraw: ");
       Scanner scn = new Scanner(System.in);
       float amount = scn.nextFloat();
       if(amount>Balance){
           System.out.println("INSUFFICIENT BALANCE");
       }
       else {
           Balance=Balance - amount;
           System.out.println("Money WithDraw Successfully");
       }
       menu();
   }
   public void depositMoney(){
       System.out.println("Enter the Amount: ");
       Scanner scn = new Scanner(System.in);
       float amount = scn.nextFloat();
       Balance = Balance + amount;
       System.out.println("Money Deposit Successfully");
       menu();
   }


}
public class ATMMachine {
    public static void main(String[] args) {
      ATM obj = new ATM();
      obj.checkpin();
    }
}
