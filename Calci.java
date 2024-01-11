import java.util.*;
interface Calci
{
	public int getSum(int a,int b);
	public int getDiff(int a,int b);
}

class CalciImple implements Calci{
	public int getSum(int a,int b){
		return a+b;
	}
	public int getDiff(int a,int b){
		return a-b;
	}
}
class CalciDriver{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int a=sc.nextInt();
		System.out.println("Enter the number 2:");
		int b=sc.nextInt();
		CalciImple c=new CalciImple();
		System.out.println(c.getSum(a,b));
		System.out.println(c.getDiff(a,b));
	}
}