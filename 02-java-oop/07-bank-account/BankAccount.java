import java.util.Random;

public class BankAccount {

    private String acctNum = "";
    private double chkBal = 0;
    private double saveBal = 0;
    private static int numOfAccts = 0;
    private static double totalAmtMny = 0;

    public void BankAcct() {
        this.chkBal = 0;
        this.saveBal = 0;
        this.acctNum = this.randomNums();
        numOfAccts++;
    }

    // ----------------------------------------------------
    // random number generator

    public String randomNums() {

        String acctNum = "";

        for (int i = 0; i < 10; i++) {
            Random num1 = new Random();
            Integer ranNum = (Integer) (num1.nextInt(9));
            acctNum += String.valueOf(ranNum);
        }
        // System.out.println(numString);

        return acctNum;
    }
    // ----------------------------------------------------
    // getters

    public double getChkBal() {
        return this.chkBal;
    }

    public double getSaveBal() {
        return this.saveBal;
    }

    public double getTotal() {
        double tl = this.chkBal + this.saveBal;
        return tl;
    }
    // -----------------------------------------------------

    public void addSave(double amt) {
        this.saveBal += amt;
        System.out.println("Thank you for adding " + amt + " to your account, your new balance is " + this.saveBal);
    }

    public void addChk(double amt) {
        this.chkBal += amt;
        System.out.println("Thank you for adding " + amt + " to your account, your new balance is " + this.chkBal);

    }

    public void takeSave(double amt) {
        if (this.saveBal > amt) {
            this.saveBal -= amt;
            System.out.println("Your new account balance is " + this.saveBal);
        } else {
            System.out.println("You cannot overdraft this account, please request a lower amount ");
        }
    }

    public void takeChk(double amt) {
        if(this.chkBal > amt){
            this.chkBal -= amt;
            System.out.println("your new balance is " + this.chkBal);
        }
        else{
            System.out.println("You cannot overdraft this account, please request a lower amount ");
        }
    }

}
