package app;

public class ArtProject {
    public static void main(String[] args) {
        writeChars('=', 180);
        System.out.println();
        for (int i = 30; i >= 1; i--) {
            writeChars(' ', 5 + 2 * i);
            writeChars(' ', i % 12);
            writeChars('#', i);
            System.out.println();
        }
    }

    public static void writeChars(char ch, int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(ch);
        }
    }
}