package streams;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("male");
        s.add("female");
        s.stream().forEach(s1 -> System.out.println(s));
    }
}
