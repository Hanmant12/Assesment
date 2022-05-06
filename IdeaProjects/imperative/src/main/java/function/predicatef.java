package function;

import java.util.function.Predicate;

public class predicatef {
    public static void main(String[] args)
    {
        System.out.println(isValidPhone.test("91177737777"));
        System.out.println(contain.and(isValidPhone).test("91177377777"));
        System.out.println(contain.test("3"));
    }
    static Predicate<String> isValidPhone=phone-> phone.startsWith("91") && phone.length()==11 &&  phone.contains("3");;

    static Predicate<String> contain=phone-> phone.contains("3");
}
