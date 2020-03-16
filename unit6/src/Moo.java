public class Moo {
    public void method1() {
        System.out.println("moo 1");
    }

    public void method2() {
        System.out.println("moo 2");
    }

    public String toString() {
        return "moo";
    }

    public static void main(final String[] args) {
        final Moo[] elements = { new Shoe(), new Flute(), new Moo(), new Blue() };
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
            elements[i].method1();
            elements[i].method2();
            System.out.println();
        }
    }
}