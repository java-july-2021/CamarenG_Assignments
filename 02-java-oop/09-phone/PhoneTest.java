public class PhoneTest {
    public static void main(String[] args) {
        Galaxy S8 = new Galaxy("S8", 99, "mint", "ring ring");
        IPhone X = new IPhone("X Max", 20, "sprint", "*RAID SIREN*");

        S8.displayInfo();
        System.out.println(S8.ring());
        System.out.println(S8.unlock());

        X.displayInfo();
        System.out.println(X.ring());
        System.out.println(X.unlock());

    }
}