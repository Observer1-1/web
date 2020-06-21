package webhomework;

public class Fibonacci
{

		public static void main(String args[]) 
		{
			int n=200;
			
			for(int i=1;fibonacci(i)<=n;i++)
			{
				System.out.println("fibonacci("+i+")="+fibonacci(i));
			}
		}
		
		
		public static int fibonacci(int n)
		{
			if(n == 1 || n == 2)
			{
				return 1;
			}
			else
			{
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		}
}
