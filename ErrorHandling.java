public class ErrorHandling {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        int result, result2;

        try {
            result = num1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception:- " + e);
        }

        try {
            result2 = num2 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception:- " + e);
        } finally {
            result2 = 0;
            System.out.println("Finally block executed, printing result2: " + result2);

        }
    }
}
