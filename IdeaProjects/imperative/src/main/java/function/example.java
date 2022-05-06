package function;

import javax.naming.Name;
import java.util.function.Function;

public class example
{
    public static void main(String[] args)
    {
       String print=name.apply("Hanmant");
        System.out.println(print);
    }
    static Function<String,String> name= Name->Name+10;

}
