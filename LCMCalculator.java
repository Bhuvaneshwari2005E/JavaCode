import java.util.Scanner;
public class LCMCalculator {
// Function to calculate the GCD (Greatest Common Divisor)
public static int gcd(int a, int b) {
while (b != 0) {
int temp = b;
b = a % b;
a = temp;
}
return a;
}
// Function to calculate the LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
public static int lcm(int a, int b) {
return (a * b) / gcd(a, b);
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
int num1 = scanner.nextInt();
System.out.print("Enter the second number: ");
int num2 = scanner.nextInt();
int lcm = lcm(num1, num2);
System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
}
}
