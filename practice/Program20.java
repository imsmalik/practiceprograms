package practice;
//diamond problem
interface Drawable
	{
		int salary = 100;
		void draw();
		void show();
	}
interface IShape
	{
		int salary = 200;
		void shape();
		void show();
	}

interface Demo extends IShape
	{
		public class Program20 implements IShape, Drawable
			{
				int salary= 900;
				public void show()
					{
						System.out.println("inside show");			
					}
				public void draw()
					{
						System.out.println("inside draw");			
					}
				public void shape()
					{
						System.out.println("inside shape");			
					}
			}
				public static void main(String[] args) 
					{
					Program20 obj= new Program20();
					obj.shape();
					obj.show();
					obj.draw();
					
					IShape d = new Program20();
					System.out.println(d.salary);		
					System.out.println("salary "+ obj.salary);
					}
	}
