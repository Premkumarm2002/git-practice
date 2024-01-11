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