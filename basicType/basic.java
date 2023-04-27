public class Basic{
	public static void main(String[] args){

		byte var1 = 10;
		short var2 = 3;
		//short var3 = var1 + var2; byte, short char, int => int 都會以此型態做儲存	
		int var3 = var1 + var2;
		long var4 = var1 + var2;
		float var5 = var1 + var2;
		double var6 = var1 + var2;
		System.out.printf("int %d\nlong %d\nfloat %f\ndouble %f", var3, var4, var5, var6);
	}
}