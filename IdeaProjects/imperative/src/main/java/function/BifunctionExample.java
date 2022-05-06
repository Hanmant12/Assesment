package function;

import java.util.function.BiFunction;

public class BifunctionExample {

    public  static  void main(String[] args)
    {
        int result=div.apply(5,5);
        System.out.println(result);
    }
    static BiFunction<Integer,Integer,Integer> div=
            (num,num2) ->(num*num2)+num;
}
