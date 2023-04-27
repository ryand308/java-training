public class Randomtest{
	public static void main(String[] args){
		double score = Math.random(); //Math.random => double 0.0 <= x < 1.0 回傳的值
		
		// 0 ~ 100 => integer
		int scoreInt = (int)(score * 101); //強制轉型 int
		System.out.printf("My Score = %d%n", scoreInt);
		
		if(scoreInt >= 60){
			System.out.println("Pass");
		}
		if(scoreInt >= 40 && scoreInt < 60 ){
			System.out.println("retest");
		}else{
			System.out.println("Down");
		}
		
		System.out.println("The End");
	}	
}