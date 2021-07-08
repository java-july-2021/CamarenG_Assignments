
public class StringManipulator {
    public String trimAndConcat(String a1, String b1) {
        String str = a1.trim() + b1.trim();
        return str;
    }

    public Integer getIndexOrNull(String d, char e) {
        if (d.indexOf(e) <= 0) {
            return null;
        } else {
            return d.indexOf(e);
        }
    }

    public Integer getIndexOrNull(String d1, String d2) {
        if (d1.indexOf(d2) <= 0) {
            return null;
        } else {
            return d1.indexOf(d2);
        }
    }

    public String concatSubstring(String a3, int x, int y, String b3) {
        return a3.substring(x, y) + b3;
    }
}