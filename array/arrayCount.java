public class ArrayCount
{
	public static void main(String[] args)
	{
		int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0};

		// Math.random() 生成隨機 0 ~ 1 之間的數。歸在 java.lang.Random;

		for(int i=0; i<900 ; i++)
		{
			double time = Math.random() * 9;
			int x = (int)time;
			num[x]++;
		}
		for(int j=1; j<num.length ; j++) System.out.printf("數字 %d 出現次數: %d%n", j, num[j] );
		if(num[0]>0) System.out.println("淘汰次數: " + num[0]);
	}
}