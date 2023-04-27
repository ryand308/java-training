public class SwitchTest{
	public static void main(String[] args){
		byte n = 10; // long, float, double 無法放在switch
		
		// byte, short, char, int, String...enum
		switch(n){
			case 1:   
				System.out.println("A");
				break;
			case 10:
				System.out.println("B");
				break;
			case 100:   // byte range -128 ~ 127; case 128: overflow error
				System.out.println("C");
				break;
			default:
				System.out.println("F");
		}
	}
}