import java.util.ArrayList;

public class exceptions {
    public void arrayL1() {
        ArrayList<Object> list = new ArrayList<Object>();

        list.add("13");
        list.add("Hello World!");
        list.add(48);
        list.add("Goodbye World");

        for (int i = 0; i < list.size(); i++) {
            try {
                Integer castedValue = (Integer) list.get(i);
                System.out.println(list.get(i));
            } catch (Exception e) {
                System.out.println("Sorry");
                System.out.println(e);
                System.out.println(
                        " error is at index: " + i + " and the value that cauese the error is: " + list.get(i));
            }
        }
    }
}
