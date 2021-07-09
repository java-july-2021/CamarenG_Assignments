import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class puzzlingTest {
    public static void main(String[] args) {
        puzzling puzzel = new puzzling();
        ArrayList<String> arrayY1 = new ArrayList<String>();
        int[] arrayX1 = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };

        arrayY1.add("Nancy");
        arrayY1.add("Jinichi");
        arrayY1.add("Fijibayash");
        arrayY1.add("Momochi");
        arrayY1.add("Ishikawa");

        System.out.println(puzzel.sum(arrayX1));
        System.out.println(puzzel.shuffArr(arrayY1));
        puzzel.alaph();
        puzzel.ranNum();
        puzzel.ranNumSorted();
        puzzel.ranString();
        puzzel.ranWords();
    }
}
