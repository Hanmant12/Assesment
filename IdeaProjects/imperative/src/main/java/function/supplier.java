package function;

import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args)
    {

        System.out.println(getconnection.get());
    }
    static Supplier<String> getconnection=()-> "jdb:localhost:3306";
}
