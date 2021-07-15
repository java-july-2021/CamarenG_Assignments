public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bnkacct = new BankAccount();

        System.out.println("Your current checking balance is " + bnkacct.getChkBal());
        System.out.println("Your current savings balance is " + bnkacct.getSaveBal());
        System.out.println("you wish to add $50 to your savings");
        bnkacct.addSave(50);
        System.out.println("You wish to add $100 to your checkings");
        bnkacct.addChk(100);
        System.out.println("Your ballance across all accounts is " + bnkacct.getTotal());
        System.out.println("you wish to withdrawl $200 from checkings");
        bnkacct.takeChk(200);
        System.out.println("you wish to withdrawl $20 from checkings");
        bnkacct.takeChk(20);
        System.out.println("you wish to withdrawl $300 from savings");
        bnkacct.takeSave(300);
        System.out.println("you wish to withdrawl $2 from savings");
        bnkacct.takeSave(2);
        System.out.println("Your current checking balance is " + bnkacct.getChkBal());
        System.out.println("Your current savings balance is " + bnkacct.getSaveBal());
        System.out.println("Your ballance across all accounts is " + bnkacct.getTotal());


        

        //bnkacct.randomNums();
    }
}
