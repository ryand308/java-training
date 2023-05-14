public class MultiLength{
    public static void main(String[] args){
        int[][] ary = new int[3][];
        ary[0] = new int[4];
        ary[1] = new int[] {1, 2, 3};
        ary[2] = new int[2];

        // ary.length 未顯示一維長度 
        System.out.println("ary.length = " + ary.length );

        // 如果要顯示不同維度長度
        System.out.println("ary[0].length = " + ary[0].length);
        System.out.println("ary[1].length = " + ary[1].length);
    }
}