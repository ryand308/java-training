public class CountTime
{
	public static void main(String[] args)
	{
		int num1, num2, num3, num4, num5, num6, num0;
		num0 = num1 = num2 = num3 = num4 = num5 = num6 = 0;
		// Math.random() 生成隨機 0 ~1 之間的數(double)
		
		count:for(int i=0; i<=600 ; i++){
			double time = Math.random() *10;
			int number = (int)time % 7;
			switch(number){
				case 1: 
				num1++;
				break;
				case 2:
				num2++;
				break;
				case 3:
				num3++;
				break;
				case 4:
				num4++;
				break;
				case 5:
				num5++;
				break;
				case 6:
				num6++;
				break;
				case 0:
				num0++;
				break;
			}
		}
			System.out.printf("num1 出現次數:%d%nnum2 出現次數:%d%nnum3 出現次數:%d%nnum4 出現次數:%d%nnum5 出現次數:%d%nnum6 出現次數:%d%n",
			num1, num2, num3, num4, num5, num6);
			if(num0 > 0)
			System.out.printf("淘汰次數:%d", num0);
	}
}