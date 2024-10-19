public class Example2 {
	public static void main(String[] args) {
		
		Book[] book = Book.values();

		for(int i = 0; i < book.length; i++) {
			System.out.println(
				"Book name: " + book[i] + 
				",\tprice: " + book[i].getPrice() +
				",\tAmount: " + book[i].getAmount()
			);
		}

	}
}
enum Book {
	//Book x = new Book();
	Java11(600, 10),//x[0] = new Book(600, 10); 
	JavaWeb(750, 5),//x[1] = new Book(750, 5);
	Spring(800, 7);	//x[2] = new book(800, 7);

	//定義 field , constructors , setter/getter

	// field
	private Integer price;
	private Integer amount;

	// constructor
	// enum 的建構式不使用封裝權限 public 
	private Book(Integer price, Integer amount){
		this.price = price;
		this.amount = amount;
	}

	// getter/setter
	public void setPrice(int price)
	{
		this.price=price;
	}

	public int getPrice()
	{
		return price;
	}

	public void setAmount(int amount)
	{
		this.amount=amount;
	}

	public int getAmount()
	{
		return amount;
	} 
}