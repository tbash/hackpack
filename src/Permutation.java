import java.util.*;

public class Permutation {
    ArrayList<String> arr = new ArrayList<>();

    ArrayList<String> index(String s) {
        index("", s);
        return arr;
    }

    private void index(String _, String s) {
        if (s.length() == 0) arr.add(_);
        else {
            for (int i=0;i<s.length();i++)
                index(_ + s.charAt(i), s.substring(0, i) + s.substring(i+1, s.length()));
        }
    }
}
