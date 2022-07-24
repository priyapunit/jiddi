package calci;

public class SUb {
	int m;
	static int sum;
	static int diff;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CAlculator obj1 = new CAlculator();
		sum= obj1.add();
		diff=obj1.diffirence();
		m=sum*diff;
		System.out.println(m);
	}

}
