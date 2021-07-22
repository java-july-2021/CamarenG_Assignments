public class HumanTest {
    public static void main(String[] args) {

        Human wiz = new Human();
        Human ninja = new Human();
        Samurai sm = new Samurai();
        Samurai sm1 = new Samurai();

        System.out.println(wiz.getHealth());
        System.out.println(sm.attack(wiz));
        System.out.println(sm.getHealth());
        sm.howMany();
        System.out.println(sm1.getHealth());

    }
}
