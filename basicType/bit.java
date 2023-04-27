public class Bit{
    public static void main(String[] args){   
        // 合法定義變數名稱
        byte var1;
        byte var2, var3 = 2;
        byte var4 = 5;
        int var5 = 542, var6 = 177;
        byte $_$ = 12; // 合法的 變數名稱
        
        long num = 1000000l;
        
        System.out.println(var4);
        System.out.println(var6);
        //System.out.println(var2); 未定義行為 Error
        System.out.println(var3);
        //System.put.println(var1); 未定義行為 Error

        float x = 3.2f;
        double y = 0.31416759d;

        boolean i = true;
        i = false;

        char a = 97; // ASCII code
        char b = 'b';
        char c = '\u6587' ;
        System.out.println(c);
    }
}