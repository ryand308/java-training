import java.util.Scanner;
public class ScanOutput{
    public static void main(String[] args){
        String word;
        Scanner scanf = new Scanner(System.in,"Big5");
        System.out.print("請輸入中文: ");
        word = scanf.next();
        System.out.println(word);


    }
}