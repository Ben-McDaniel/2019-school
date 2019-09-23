public class PlayingWithCasting
{

	public static void main( String[] args )
	{
		int x = 5;
		int y = 2;
		double z = 4.0;

		int k;
		double p;

		
		k = x / y;
 	
k = (int) z / y;
System.out.println("Line 1: " + k); 	
k = (int) (z / y);
System.out.println("Line 1: " + k); 	
p = x / y;
System.out.println("Line 1: " + p); 	
p = z / x;
System.out.println("Line 1: " + p); 	
p = (int) z / y;
System.out.println("Line 1: " + p); 	
p = (double) x / y;
System.out.println("Line 1: " + p); 	
p = (double) (x / y);
System.out.println("Line 1: " + p); 	
}
}
