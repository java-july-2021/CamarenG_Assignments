import java.util.ArrayList;
import java.util.Arrays;
public class basicsTest {
    public static void main(String[] args) {
        basics count = new basics();
        
        int[] arrayX ={1, 3, 5, 7, -9, -13};
        int[] arrayY = {4, 2, 7, 5, 9, 6, 2}; 

        count.countUp();
        count.countOdd();
        count.printSum();
        count.iteArray(arrayX);
        count.findMax(arrayX);
        System.out.println("The avg is: " + count.getAvg(arrayX));
        System.out.println(count.oddArr());
        System.out.println(count.greaterThan(arrayX, 4));
        System.out.println(Arrays.toString(count.square(arrayX)));
        System.out.println(Arrays.toString(count.negitiveNums(arrayX)));
        System.out.println(Arrays.toString(count.minMaxAvg(arrayX)));
        System.out.println(Arrays.toString(count.shifting(arrayY)));

    }
}