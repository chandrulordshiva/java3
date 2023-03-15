import java.util.Scanner;

class Ageexception extends Exception{
    Ageexception(String s)
    {
        super(s);
    }
}
class Exxception
{
    public static void main(String a[])throws Ageexception
    {
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        try{
        if(b < 18)
        {
            throw new Ageexception("not correct age");
        }
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    finally{
        System.out.println("program finished");
    }

    }
}