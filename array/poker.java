public class Poker{
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
                count++;
            }
        }
        for(int card: tablet) System.out.println(card+1);
        System.out.printf("總共 %d 張牌%n", count);
        long end = System.currentTimeMillis();
        System.out.println("費時 (1/1000秒):" + (end - start));
    }
}