import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {  // Removed the semicolon here
            fact *= i;
        }
        System.out.println("Factorial: " + fact);  // Moved the print statement outside the loop
    }
}
