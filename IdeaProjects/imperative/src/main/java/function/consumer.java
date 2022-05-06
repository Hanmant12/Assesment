package function;

import javax.naming.Name;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class consumer {
    public static void main(String[] args) {
        show.accept("raje");
        System.out.println(check.test("01"));
    }
    static Consumer<String> show= Name->
            System.out.println(Name);

    static Predicate<String> check=phone-> phone.startsWith("01");
}
