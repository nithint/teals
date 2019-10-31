package app;

public class ReturnValues {
    public static void main(String[] args) throws Exception {
        sum(5,7);
    }

    // if the signature of the method was updated to an int, there would be an error.
    // cannot return double when return type is int.
    public static double sum(int one, int two)
    {
        double sum = (double)(one+two);
        System.out.println("Computing the sum");
        return sum;
    }
}