package function;

import java.util.function.Function;

public class main {
    public static void main(String[] args)
    {
int mul=addition.apply(5);
        System.out.println(mul);
        int multply=mult.apply(6);
        System.out.println(multply);
//  Function<Integer,Integer> sum=mul.andThen(multply);
//        System.out.println(sum.apply(5));
        System.out.println(multply);

    }
   static Function<Integer,Integer> addition=
           number->number*10;

    static  Function<Integer,Integer> mult=number-> number+50;
}
