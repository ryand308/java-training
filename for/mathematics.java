public class Mathematics{
	public static void main(String[] args){
	
		// 製作一個九九乘法表
		int i, j;
		for(i=1;i<10;i++){
			for(j=1;j<10;j++){
				System.out.printf("%d x %d = %2d  ", j, i, i*j);
			}
			System.out.println("");
		}
	}
}