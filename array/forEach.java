public class ForEach{
    public static void main(String[] args){

        int[] y = {1, 2, 7, 8, 10};       // {1, 2, 7, 8, 10}
        int[] z = new int[] {9, 9, 9, 9}; // {9, 9, 9, 9}

        // 迭代表示
        for(int i:y) System.out.printf("%d %n", i);
                
        for(int j=0 ; j<z.length ; j++) System.out.printf("z[%d]= %d%n", j, z[j]);
    }
}