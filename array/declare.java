public class Declare{
    public static void main(String[] args){
        // 都正確語法
        char[] i ={'x', 'y', 'z'};

        // 可讀做 int[] varable;整數陣列型別 變數名稱  
        int[] x = new int[5];             // {0, 0, 0, 0, 0}
        int[] y = {1, 2, 7, 8, 10};       // {1, 2, 7, 8, 10}
        int[] z = new int[] {9, 9, 9, 9}; // {9, 9, 9, 9}
        
        //類似C/C++ 宣告，值為整數的陣列
        int v[] = {9, 8, 7, 6};
        /*
         但概念不一樣；v[4] = {9, 8, 7, 6}; 語法錯誤
         在C/C++ 屬於賦值。但在java 是設定初始值。
        */
        for(int j=0 ; j<v.length ; j++) System.out.println(v[j]);
    }
}