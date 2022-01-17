package practice;
// TRY CATCH
public class Program15 
{
	    public static void main(String args[]) 
	    {
	        int[] array = new int[4];
	        try 
	        {
	            array[8] = 5;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	        finally 
	        {
	            System.out.println("The array is of size " + array.length);
	        }
	}
}
