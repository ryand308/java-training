public class Example1 {
	public static void main(String[] args){

		Company.Product[] prodect = Company.Product.values();
		Company.Week[] 		 week = Company.Week.values();
		Company.Month[] 	month = Company.Month.values();


		System.out.println(
		prodect[0] + "\n" + week[0] + "\n" + month[0]
		);
	}	
}
class Company{
	
	enum Product
	{
		mainboard,keyboard,mouse,screen;
	}
	enum Week
	{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	}
	enum Month
	{	
		//	用中文也可以
		一月,二月,三月,四月,五月,六月,七月,八月,九月,十月,十一月,十二月;
	}
}