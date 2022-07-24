
public class Calci {
	int a,b;
	int sum, diff;
	public int add()
	{
		a=100;
		b=10;
		sum=a+b;
		System.out.println(sum);
		return(sum);
		}
		public int difference() {
			a=90;
			b=20;
			diff=a-b;
			System.out.println(diff);
			return(diff);
			
		}
	
public static void main(String[] args) {
	
	Calci obj1=new Calci();
	obj1.add();
	obj1.difference();
}
}
