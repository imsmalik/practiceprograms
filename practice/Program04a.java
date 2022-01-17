package practice;
public class Program04a
{
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		Program04a b=new Program04a();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		}
}
