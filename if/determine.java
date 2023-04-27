public class determine
{
	public static void main(String[] args)
	{
		int a = 10, b = 3;
		if(a >= 10 && b <= 3){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}

		if(a++ > 10 || b-- > 3){
			System.out.printf("OK: a = %d; b = %d", a, b);
		}else{
			System.out.printf("XX: a = %d; b = %d", a, b);
		}
	}
}