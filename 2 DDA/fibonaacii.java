import java.util.*;

public class FibonacciUniqueSteps {

    static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibo(int n) {
        // Base cases
        if (n == 0 || n == 1) {
            memo.put(n, n);
            return n;
        }

        // If already calculated, return without printing steps
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Compute only if not done before
        int a = fibo(n - 1);
        int b = fibo(n - 2);

        int result = a + b;

        // Print unique step
        System.out.println("fibo(" + n + ") = " + a + " + " + b + " = " + result);

        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = fibo(n);

        System.out.println("\nFinal Answer: Fibonacci of " + n + " = " + result);

        sc.close();
    }
}
