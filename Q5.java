import java.util.Scanner;

public class Q5{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Radius:");
	double c=sc.nextDouble();
	System.out.print("Enter height:");
	double h=sc.nextDouble();
	double r=3.14*c*c*h;
	System.out.print("The Volume is:");
	System.out.println(r);
}
}