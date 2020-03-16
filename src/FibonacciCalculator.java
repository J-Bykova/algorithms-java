public class FibonacciCalculator {

    private static int calculateUsingRecursion(int n) {
        int fib1 = 1, fib2 = 1, nthFibonacci = 1;
        if (n < 1)
            return 0;
        if (n == 1 || n == 2)
            return nthFibonacci;

        return calculateUsingRecursion(n - 1) + calculateUsingRecursion(n - 2);

    }

    private static int calculateUsingLoop(int n) {
        int fib1 = 1, fib2 = 1, nthFibonacci = 1;
        if (n < 1)
            return 0;
        if (n == 1 || n == 2)
            return nthFibonacci;

        for (int i = 3; i <= n; i++) {
            nthFibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = nthFibonacci;

        }
        return nthFibonacci;
    }
}

