public class multidimensional{
    public static void main(String[] args){
        int[][] degree = new int[3][4];
        System.out.println(degree[2][3]);

        // 在 二維建立不同長度
        int[][] time = new int[3][];
        time[0] = new int[2];
        time[1] = new int[2];
        time[2] = new int[6];
        System.out.println(time[2][5]); 

        // 使用儲存預設值的方式
        int[][] variable = {{0, 0}, {0, 0, 0}, {0}};
        System.out.println(variable[1][2]);
    }
}