public class ForTest{
	public static void main(String[] args){
		int i = 0;
		//for(前敘述句; 判斷式; 後敘述句)
		for(test(); i<10;){ // 其實只是說明for 的前後敘述句 不一定要有，只是寫程式習慣會加
			System.out.println(i+=2); // i++ 程式設計是把它加到後段敘述句，這樣在編程會比較清楚。
		}
		// 前敘述句會習慣宣告變數值
	}
	static void test(){
		System.out.println("The function.");
	}
}