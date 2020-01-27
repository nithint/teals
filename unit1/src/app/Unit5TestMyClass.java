package app;

public class Unit5TestMyClass
{
    private int[][] data;

    public Unit5TestMyClass(int x, int y)
    {
        data = new int[x][y];
        for (int i = 0; i < x; i++)
        {
            int z = 1;
            for (int j = 0; j < y; j++)
            {
                data[i][j] = z;
                z *= i;
            }
        }
    }

    public int foo(int x, int y)
    {
        return data[x][y];
    }
}
