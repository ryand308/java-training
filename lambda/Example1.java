public class Example1 {
	public static void main(String[] args) {
		
		Book b1 = Calc::bs1; // new Book(){};

		System.out.println(b1.bookStyle("Java Oracle exam", 2500));
	}
}
interface Book
{
	String bookStyle(String bookName,double price);
}

class Calc
{
	public static String bs1(String bookName,double price)
	{
			if(price>=3000)
			{
				return "書名:"+bookName+"\t價格:"+price*0.9;
			}
			else if(price>=1500 && price<3000)
			{
				return "書名:"+bookName+"\t價格:"+price*0.95;
			}
			else
			{
				return "書名:"+bookName+"\t價格:"+price;
			}
	}


	public static String bs2(String bookName,double price)
	{
			if(price>=2000)
			{
				return "書名:"+bookName+"\t價格:"+price*0.9;
			}
			
			else
			{
				return "書名:"+bookName+"\t價格:"+price;
			}
	}
}