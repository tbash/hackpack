import java.util.*;

public class Combination {
    ArrayList<String> arr = new ArrayList<>();

    ArrayList<String> index(String s) {
        index("", s);
        return arr;
    }

    private void index(String _, String s) {
        if(!_.isEmpty()) arr.add(_);
        for (int i=0;i<s.length();i++)
            index(_ + s.charAt(i), s.substring(i+1));
    }
}
