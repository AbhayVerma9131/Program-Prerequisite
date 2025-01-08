import java.util.Scanner;

public class Q8{

	public static int power(int x, int y)
	{
		int temp;
		if (y == 0)
			return 1;
		temp = power(x, y / 2);

		if (y % 2 == 0)
			return temp * temp;
		else {
			if (y > 0)
				return x * temp * temp;
			else
				return (temp * temp) / x;
		}
	}


public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A:");
	int p=sc.nextInt();
	System.out.print("Enter b:");
	int r=sc.nextInt();
	int si=power(p,r);
	System.out.print("The power claculation is:");
	System.out.println(si);
}
}