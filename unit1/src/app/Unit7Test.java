package app;

import java.util.Arrays;

public class Unit7Test
{
    public static void main(String[] args)
    {
        int[] a = new int[]{-2, 15, 1, 9, 3, 11, 7, 4};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a)
    {
        int left =0, right = a.length - 1;
        int k;
        while (left < right)
        {
            if (a[left] > a[right])
            {
                swap(a, left, right);
            }

            for (k = left + 1; k < right; k++)
            {
                if (a[k] < a[left])
                {
                    swap(a, k, left);
                }
                else if (a[k] > a[right])
                {
                    swap(a,k,right);
                }
            }

            left++;
            right--;
        }
    }

    public static void swap(int[] a, int j, int k)
    {
        int temp = a[j];
        a[j] = a[k];
        a[k] = temp;
    }
}