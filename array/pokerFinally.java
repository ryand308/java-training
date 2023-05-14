import java.util.Arrays;
public class PokerFinally{
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        int[] tablet = new int[52]; // 一共 52 張牌
        int count = 0;
        int time;
        for(int i=0; i<tablet.length; i++){
            time = (int)(Math.random()*52);
            //System.out.println(time);
            
            // 檢查是否重複
            boolean check = false;
            test:for(int j=0; j<i; j++){
                if(time == tablet[j]){
                    check = true;
                    break test;
                }
            }
            if(check && i>0){
                i--;
            }else{
                tablet[i] = time;
            }
        }
        int[][] players = new int[4][13];
        for(int i=0; i<tablet.length; i++){
            players[i%4][i/4] = tablet[i];
        }
        /* 0  ~ 12 黑桃
           13 ~ 25 紅心
           26 ~ 38 方塊
           39 ~ 51 梅花 */
        String[] suits = {"黑桃", "紅心", "方塊", "梅花"};
        String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for(int[] player: players){
            Arrays.sort(player); // 理牌
            for(int card: player){
                System.out.printf("%s%2s ", suits[card/13], value[card%13]);
            }
            System.out.println("");
        }
    }
}