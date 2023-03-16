class Joker{
    void hello()
    {
        System.out.println("how are you");
    }
}





public class Chandruanonymous extends Joker {
    public static void main(String arg[])
    {
        Joker j = new Joker()
        {
            void hello()
            {
                System.out.println("hello world");
            }
        };
        j.hello();
    }
}
