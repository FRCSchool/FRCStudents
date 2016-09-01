class Math
{
    /**
     * Calculates a number in the Fibonacci sequence.
     * @param p The position of the number to calculate (0 or greater).
     * @return The Fibonacci number.
     */
    static int fib(int p)
    {
        if(p <= 1) return 1;
        return fib(p-1)+fib(p-2);
    }

    /**
     * Calculates the factorial of a number.
     * @param n The number to be factorialized (1 or greater).
     * @return The factorial.
     */
    static int fac(int n)
    {
        if(n == 1) return 1;
        return n*fac(n-1);
    }

    /**
     * Calculates a power of two.
     * @param p The power to raise two by (1 or greater).
     * @return Two to the power of the specified number.
     */
    static int pow(int p)
    {
        if(p == 1) return 2;
        return 2*pow(p-1);
    }

    /**
     * Prints an array.
     * @param a The array to print.
     * @param p The position to start at (zero to array length).
     */
    private static void print_array_recursive(int[] a, int p)
    {
        if(p == a.length) return;
        System.out.print(a[p]+" ");
        print_array_recursive(a, ++p);
    }

    /**
     * Prints an array.
     * @param a The array to print.
     */
    static void print_array(int[] a){ print_array_recursive(a, 0); }
}

public class Practice
{
    public static void main(String[] args)
    {
        System.out.print("First 10 Fibonacci numbers: ");
        for(int i = 0; i < 10; ++i) System.out.print(Math.fib(i)+" ");
        System.out.println("\nFactorial of 10: "+Math.fac(10));
        System.out.println("2 to the power of 10: "+Math.pow(10));
        System.out.print("Array of 10 numbers: ");
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Math.print_array(a);
    }
}
