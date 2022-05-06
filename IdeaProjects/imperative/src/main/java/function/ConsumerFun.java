package function;

public class ConsumerFun
{
    public static void main(String[] args)
    {
        greet(new consumer(44,"hanmant"));
    }

    public static void greet(consumer consumer)
    {
        System.out.println("hello "+consumer.name+ ", thank you for registering "+consumer.num);
    }
    static class consumer
    {
        private final int num;
        private final String name;

        consumer(int num, String name) {
            this.num = num;
            this.name = name;
        }
    }
}
