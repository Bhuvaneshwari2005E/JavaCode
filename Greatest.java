import java.util.Scanner;
public class Greatest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a:");
int A = sc.nextInt();
System.out.print("Enter b:");
int B = sc.nextInt();
System.out.print("Enter c:");
int C = sc.nextInt(); 
int G = (A>B)?((A>C)?A:C):((B>C)?B:C);
System.out.print("The larger value is "+G);
}
}
