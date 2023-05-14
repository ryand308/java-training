public class None{
    public static void main(String[] args){
        double[] ary = new double[3];

        for(int i=0; i<3 ; i++)System.out.println(ary[i]);
        // java 這裡直接給未定陣列 值為 0
        // 但在C/C++ 屬未定義行為。
    }
}