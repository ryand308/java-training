public class Test{
	public static void main(String[] args){
		//short -32,768 ~ 32,768 其結果與 byte 相同
		//byte -128 ~ 127
		//byte, short, char, int => int 經運算 回儲存到 int
		byte num1 = 10, num2 = 3;
		//byte num3 = num1 + num2; 產生編譯失敗，運算過程所存放的資料型態為 int
		
		num1 ++;
		System.out.println(num1);
		num1 += 100;
		System.out.println(num1);
		System.out.println(++num1); //112

		System.out.println(num1++); //112
		System.out.println(num1);   //113

		num1 += 14;
		System.out.println(num1);

		num1 +=1;
		System.out.println(num1); // -128 overflow

	}
}