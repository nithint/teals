package app;
public class Homework216
{
   public static void main(String[] args)
   {
       int i = 2;
       int j = 3;
       int k = 4;
       int x = i + j + k;

       i = x - i -j;
       j = x - j -k;
       k = x - i - k;
   }
}