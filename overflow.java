public class Hey{
    public static void main(String[] args){
        int x = 0;
        boolean run =true;
        
        while(run){
            x++;
            if(x<0){
                System.out.println(x);
                run =false; //output >>> -2147483648
            }
        }
        x=x-1;
        System.out.println(x);
    }
}  // output >>> 2147483647