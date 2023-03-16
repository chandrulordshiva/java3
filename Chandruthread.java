class Joker extends Thread
{
    public void run()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello world");
    }
}
class Joker1 extends Joker
{
    public void run()
    {
        System.out.println("Warrior");
    }
}


class Chandruthread extends Joker{
    public static void main(String args[])
    {
        Joker j = new Joker();
        Joker1 j1 = new Joker1();
        j.start();
        try {
            j.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
          j1.start();
    }
}