import java.util.Scanner;

public class Q4{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Radius:");
	double c=sc.nextDouble();
	double r=3.14*c*c;
	System.out.print("The Area is:");
	System.out.println(r);
}
}