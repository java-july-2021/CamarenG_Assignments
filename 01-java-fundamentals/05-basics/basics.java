import java.util.ArrayList;

public class basics {
    ArrayList<Integer> listX = new ArrayList<Integer>();

    public void countUp() {
        for (int i1 = 0; i1 <= 255; i1++) {
            System.out.println(i1);
        }
    }

    public void countOdd() {
        for (int i2 = 1; i2 <= 255; i2 += 2) {
            System.out.println(i2);
        }
    }

    public void printSum() {
        int temp1 = 0;
        for (int i3 = 0; i3 <= 255; i3++) {
            temp1 += i3;
            System.out.println("New num: " + i3 + " Sum: " + temp1);
        }
    }

    public void iteArray(int[] x) {
        for (int tmp2 = 0; tmp2 < x.length; tmp2++) {
            System.out.println(x[tmp2]);
        }
    }

    public void findMax(int[] max) {
        int tmp3 = max[0];
        for (int x = 0; x < max.length; x++) {
            if (max[x] > tmp3) {
                tmp3 = max[x];
            }
        }
        System.out.println("The Max Is: " + tmp3);
    }

    public int getAvg(int[] avg) {
        int sum = 0;
        int result = 0;
        for (int tmp4 = 0; tmp4 < avg.length; tmp4++) {
            sum += avg[tmp4];
        }
        result = sum / avg.length;
        return result;
    }

    public ArrayList<Integer> oddArr() {
        for (int x = 1; x <= 255; x += 2) {
            listX.add(x);
        }
        return listX;
    }

    public int greaterThan(int[] tmparry, int y) {
        int tmp6 = 0;
        for (int x = 0; x < tmparry.length; x++) {
            if (tmparry[x] > y) {
                tmp6++;
            }
        }
        return tmp6;
    }

    public int[] square(int[] tmparry1) {
        int value = 0;
        int[] valueArr = { 0, 0, 0, 0, 0, 0 };
        for (int x = 0; x < tmparry1.length; x++) {
            value = tmparry1[x] * tmparry1[x];
            valueArr[x] = value;
        }
        return valueArr;
    }

    public int[] negitiveNums(int[] tmparry2) {
        int[] valueArr2 = { 0, 0, 0, 0, 0, 0 };
        for (int x = 0; x < tmparry2.length; x++) {
            if (tmparry2[x] <= 0) {
                tmparry2[x] = 0;
                valueArr2[x] = tmparry2[x];
            } else {
                valueArr2[x] = tmparry2[x];
            }
        }
        return valueArr2;
    }

    public int[] minMaxAvg(int[] arryIn) {
        // will print out [7, 0, 2] as it is grabbing arrayX after the negitiveNums call
        int tmp3 = 0;
        int tmp4 = tmp3;
        int[] resultArry = { 0, 0, 0 };
        for (int x = 0; x < arryIn.length; x++) {
            // System.out.println(arryIn[x]);
            // max
            if (arryIn[x] > tmp3) {
                tmp3 = arryIn[x];
            }
            resultArry[0] = tmp3;
            // -------------------
            // min
            if (arryIn[x] < tmp4) {
                tmp4 = arryIn[x];
            }
            resultArry[1] = tmp4;

            // -------------------
            // avg
            int sum = 0;

            for (int tmp5 = 0; tmp5 < arryIn.length; tmp5++) {
                sum += arryIn[tmp5];
            }
            resultArry[2] = sum / arryIn.length;

            // -------------------
        }
        return resultArry;
    }

    public int[] shifting(int[] arrs) {
        int[] returnArr = { 0, 0, 0, 0, 0, 0, 0 };
        for (int c = 0; c < arrs.length; c++) {
            if (c < arrs.length - 1) {
                returnArr[c] = arrs[c + 1];
            } else if (c == arrs.length) {
                returnArr[c] = 0;
            }
        }
        return returnArr;
    }
}
