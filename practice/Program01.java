package practice;
//primitive data types
public class Program01 
	{
		public static void main(String[] args) 
			{
				String a="98547288";
				int b=Integer.parseInt(a);
				System.out.println(" Conversion of String to Int "+ b);
				float c=Float.parseFloat(a);
				System.out.println(" Conversion of String to Float "+ c);
				double d=Double.parseDouble(a);
				System.out.println(" Conversion of String to Double "+ d);
				long e=Long.parseLong(a);
				System.out.println(" Conversion of String to Boolean "+ e);
				boolean f=Boolean.parseBoolean(a);
				System.out.println(" Conversion of String to Boolean "+ f);
			}
}
