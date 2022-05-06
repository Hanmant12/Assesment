package optionales;

import java.util.Optional;

public class main {
    public static void main(String[] args) {

        Object o= Optional.ofNullable(("Hello").describeConstable().orElseGet(()->"degault"));
        System.out.println(o);

    }
}
