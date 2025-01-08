import java.util.Scanner;

public class Q7{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter length:");
	double p=sc.nextDouble();
	System.out.print("Enter width:");
	double r=sc.nextDouble();
	double si=2*(p+r);
	System.out.print("The Perimeter is:");
	System.out.println(si);
}
}