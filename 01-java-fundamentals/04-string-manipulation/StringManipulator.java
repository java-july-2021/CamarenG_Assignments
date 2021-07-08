

public class StringManipulator{
    public String trimAndConcat(String a1, String b1){
        String str = a1.trim() + b1.trim();
        return str;
    }
    public Integer getIndexOrNull(String d, char e){
        if(d.indexOf(e) <= 0){
            return null;
        }
        else{
        return d.indexOf(e);
        }
    }
}