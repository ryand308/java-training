public class SumWhile
{
	public static void main(String[] args)
	{
		int sum = 0;
		int n = 100;int i = 0;
		while( i <= n )
		{
			sum += i;
			i++;
		}
		System.out.printf("1+2+...%d= %d", n, sum);
	}
}