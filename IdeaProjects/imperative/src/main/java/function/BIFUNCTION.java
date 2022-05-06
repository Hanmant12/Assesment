package function;

import java.util.function.BiFunction;

public class BIFUNCTION<number> {
    public static void main(String[] args)
    {
int result=addition.apply(5,6);
        System.out.println(result);
    }
    static BiFunction<Integer,Integer,Integer> addition=
            (number,number2) ->(number*5)+number2;
}
