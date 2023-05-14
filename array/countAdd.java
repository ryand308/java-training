public class CountAdd
{
	public static void main(String[] args)
	{
		//int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] num = new int[9]; // java 陣列預設值為0；不會有位定義行為
		// Math.random() 生成隨機 0 ~ 1 之間的數

		for(int i=0; i<500 ; i++)
		{
			double time = Math.random() * 9;
			// 我只有 1~6 的數字，要增加 4, 5, 6 的出現次數
			int x = (int)time;
			num[x<6?x:x-3]++;
			// x<6?num[x]++:num[x-3]++; 是錯的
		}
		for(int j=0; j<6 ; j++) System.out.printf("數字 %d 出現次數: %d%n", j+1, num[j] );		
	}
}