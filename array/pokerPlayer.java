public class PokerPlayer{
    public static void main(String[] args){

        int[] tablet = new int[52]; // 一共 52 張牌
        int count = 0;
        int time;
        for(int i=0; i<tablet.length; i++){
            time = (int)(Math.random()*52);
            
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
        int[][] play = new int[4][13];
        for(int i=0; i<play.length; i++){

            System.out.printf("The player %d 的手牌:", i+1);
            
            for(int j=0; j<play[i].length; j++){
                play[i][j] = tablet[count]+1;
                System.out.printf("%2d ", play[i][j]);
                count++;
            }
            System.out.println("");            
        }        
    }
}