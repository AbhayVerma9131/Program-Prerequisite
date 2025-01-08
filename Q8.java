import java.util.Scanner;
public class Q8{

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A:");
	int p=sc.nextInt();
	System.out.print("Enter b:");
	int r=sc.nextInt();
	double si=Math.pow(p,r);
	System.out.print("The power claculation is:");
	System.out.println(si);
}
}