import java.util.Scanner;

public class Q3{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Temperature in Celcius:");
	float c=sc.nextFloat();
	float r= (c*9/5)+32;
	System.out.print("The temperature in Fahrenheit:");
	System.out.println(r);
}
}