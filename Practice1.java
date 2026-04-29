public class Practice1 {

    public static long fibonacci(long a) {
        if (a <= 1) return a;
        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    public static long runfibonacci(int a) {
        long sum = 0;
        for (long i = 0; fibonacci(i) <= 4000000; i++) {
            if (fibonacci(i) % 2 == 0) sum += fibonacci(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        long answer = runfibonacci(200);
        long answer2 = runfibonacci(400);

        System.out.println(answer);
        System.out.println(answer2);
    }
}
