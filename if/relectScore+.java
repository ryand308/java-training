public class relectScore{
	public static void main(String[] args){
		double rand = Math.random();
		int score = (int)(rand * 101);
		
		System.out.printf("Score is %d%n", score);
		
		// score 90+ => A, 80+ => B, 70+ => C, 60+ => D, 60- => E
		if(score >= 90){
			System.out.println("A");
		}else if(score >= 80){
			System.out.println("B");
		}else if(score >= 70){
			System.out.println("C");
		}else if(score >= 60){
			System.out.println("D");
		}else{
			System.out.println("E");
		}
						
		System.out.println("The End");
	}
}