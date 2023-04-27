import java.lang.Math;
public class Calendar{
	public static void main(String[] args){
		/*每個月份中的天數，不盡相同。
		  請練習開發一段程式，顯示出個月份的天數。
		  2 月份則以 28 天計算，因為沒有給予年份的資料，所以做編程。
		*/
		int month = (int)(Math.random()*12 +1);
		System.out.printf("%d 月份有 ", month);

		switch(month){
			case 1, 3, 5, 7, 8: //倘若沒有break; 那switch 就會繼續向下執行
			case 10, 12:
			System.out.printf("%d 天", 31);
			break;
			
			case 4, 6:
			case 9, 11:
			System.out.printf("%d 天", 30);
			break;
			
			case 2:
			System.out.printf("%d 天", 28);
			break;

			default:
			System.out.println("可能無此月份");
			break;
			
		}
	}
}