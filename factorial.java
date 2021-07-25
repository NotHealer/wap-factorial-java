import java.util.Scanner;

// 4! = 4x3x2x1 = 24
// 5! = 5x4x3x2x1 = 120

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Print Factorial:");
        Integer num = sc.nextInt(), fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
