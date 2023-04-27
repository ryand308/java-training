public class Type{
	public static void main(String[] args){
		// 資料型態的轉換 
		/*
		小 => 大 自動轉換
		大 => 小 強制轉換(手動) 其值未超 型態的範圍；否則喪失其精度
		*/
		//byte -128 ~ 127
		//short -32768 ~ 32767
		byte bt;
		short sht = 127;
		
		bt = (byte)sht;  //強制轉換
		System.out.println(bt);	

		sht += 1; 
		bt = (byte)sht; // overflow
		System.out.println(bt); //喪失精確度
		//byte, short, char, int, long, float, double 順序

	}
}