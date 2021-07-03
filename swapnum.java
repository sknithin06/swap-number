package Java;
import java.util.Scanner;
public class swapnum {
	public static void main(String[] args) {
		System.out.println("Welcome to Basic Core Problem");
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a value of a:");  
		double a = sc.nextDouble();
		System.out.print("Enter a value of a:");  
		double b = sc.nextDouble();
		
		double c = a + b;
		a = c - a;
		b = c - b;
		System.out.println("Swap Number of a is:"+a);
		System.out.println("Swap Number of b is:"+b);
	}	
}
