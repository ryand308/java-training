public class Num{
	public static void main(String[] args){
		int var1 = 10; int var2 = 3;
		int var3;
		
		var3 = var1 + var2;
		System.out.printf("10 + 3 = %d\n", var3);

		var3 = var1 - var2;
		System.out.printf("10 - 3 = %d\n", var3);

		var3 = var1 * var2;
		System.out.printf("10 * 3 = %d\n", var3);

		var3 = var1 / var2;
		System.out.printf("10 / 3 = %d\n", var3);

		var3 = var1 % var2;
		System.out.printf("10 %% 3 = %d\n", var3); // %% 顯示 % 的字串， mod 符號

	}
}