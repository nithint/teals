package app;

public class Unit5Test
{
    public static void main(String[] args)
    {
        Unit5TestSomeClass one = new Unit5TestSomeClass(7);
        Unit5TestSomeClass two = new Unit5TestSomeClass(8);
        Unit5TestSomeClass three = two;

        one.setToZero();
        two.setToZero();

        System.out.println(one.getNum() + " " + two.getNum() + " " + three.getNum());

        Unit5TestMyClass a = new Unit5TestMyClass(20,20);
        System.out.println(a.foo(10,0));
    }
}