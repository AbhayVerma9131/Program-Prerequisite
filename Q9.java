import java.util.Scanner;

public class Q9{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no1:");
	int p=sc.nextInt();
	System.out.print("Enter no2:");
	int r=sc.nextInt();
	System.out.print("Enter no3:");
	int q=sc.nextInt();
	int si=(p+q+r)/3;
	System.out.print("The Average is:");
	System.out.println(si);
}
}