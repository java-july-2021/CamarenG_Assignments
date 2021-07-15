public class HumanTest {
    public static void main(String[] args) {

        Human wiz = new Human();
        Human ninja = new Human();

        System.out.println(wiz.getHealth());
        System.out.println(ninja.attack(wiz));

    }
}
