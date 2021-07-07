public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean pyth = new Pythagorean();
        double SideC = pyth.calculateHypotenuse();
        System.out.println("the length of side C is: " + SideC);
    }
}