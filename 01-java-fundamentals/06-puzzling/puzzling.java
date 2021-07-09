import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class puzzling {
    public ArrayList<Integer> sum(int[] arr) {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            tmp += arr[i];
            if (arr[i] >= 10) {
                listA.add(arr[i]);
            }
        }
        System.out.println("the sum is: " + tmp);
        return listA;
    }

    public List<String> shuffArr(ArrayList<String> arrStr) {
        ArrayList<String> stringArr = new ArrayList<String>();
        stringArr = arrStr;
        Collections.shuffle(arrStr);
        arrStr.size();
        System.out.println(arrStr);
        for (int i = 0; i < arrStr.size(); i++) {
            if (stringArr.get(i).length() < 7) { // set value to 7 to account for the " "
                stringArr.remove(i);
            }
        }
        return stringArr;
    }

    public void alaph() {
        ArrayList<Character> alp = new ArrayList<Character>();
        for (char let = 'a'; let <= 'z'; let++) {
            alp.add(let);
        }
        System.out.println(alp);
        Collections.shuffle(alp);
        System.out.println(alp);
        System.out.println(alp.get(alp.size() - 1));
        if (alp.get(0).equals('a')) {
            System.out.println("This is a vowel!");
            System.out.println(alp.get(0));
        } else if (alp.get(0).equals('e')) {
            System.out.println("This is a vowel!");
            System.out.println(alp.get(0));
        } else if (alp.get(0).equals('i')) {
            System.out.println("This is a vowel!");
            System.out.println(alp.get(0));
        } else if (alp.get(0).equals('o')) {
            System.out.println("This is a vowel!");
            System.out.println(alp.get(0));
        } else if (alp.get(0).equals('u')) {
            System.out.println("This is a vowel!");
            System.out.println(alp.get(0));
        } else {
            System.out.println(alp.get(0));
        }
    }

    public void ranNum() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Random num = new Random();
        for (int i = 0; i <= 10; i++) {
            nums.add(num.nextInt((100 - 55) + 1) + 55);
        }
        System.out.println(nums);
    }

    public void ranNumSorted() {
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        Random num1 = new Random();
        for (int i = 0; i <= 10; i++) {
            nums1.add(num1.nextInt((100 - 55) + 1) + 55);
        }
        Collections.sort(nums1);
        System.out.println(nums1);
        System.out.println(nums1.get(0));
        System.out.println(nums1.get(nums1.size() - 1));
    }

    public void ranString() {
        String ranStr = "";
        for (int i = 0; i < 5; i++) {
            Random ch = new Random();
            char ranChar = (char) ('a' + ch.nextInt(26));
            ranStr += ranChar;
        }

        System.out.println(ranStr);
    }

    public void ranWords() {
        ArrayList<String> word = new ArrayList<String>();
        for (int m = 0; m < 10; m++) {
            String ranStr = "";
            for (int i = 0; i < 5; i++) {
                Random ch = new Random();
                char ranChar = (char) ('a' + ch.nextInt(26));
                ranStr += ranChar;
            }
            word.add(m, ranStr);
        }
        System.out.println(word);
    }
}
