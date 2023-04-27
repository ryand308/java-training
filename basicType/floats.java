public class Decimal{
	public static void main(String[] args){
		float dec1 = 10;
		float dec2 = 3.2f; //dec = 3.0 會以 double 的型態儲存； + f or F  將型態儲存 float
		float dec3;
		
		dec3 = dec1 + dec2; // int + float = float
		System.out.printf("10 + 3.2f = %.1f\n", dec3);
		
		dec3 = dec1 / dec2; 
		System.out.printf("10 / 3.2f = %.2f\n", dec3);

		dec3 = dec1 % dec2; 
		System.out.printf("10 %% 3.2f = %.3f\n", dec3);
		
		dec3 ++; // 此時 dec3 value is 0.4
		System.out.printf("dec++ = %f\n", dec3);
		
	}
}