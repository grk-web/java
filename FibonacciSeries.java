package pack;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;

        System.out.println("First " + n + " Fibonacci numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
