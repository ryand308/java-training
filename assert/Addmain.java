class Addmain {
    public static void main(String[] args) {
        
        java.util.Scanner scanf = new java.util.Scanner(System.in);
        System.out.print("please enter score value: ");
        int score = scanf.nextInt();

        assert score>=0 : "請輸入>0 的整數";
        
        //command line$java -ea Addmain

        /*
            Exception 的測試 參數要加 -ea；如果不符合條件，跳出 "請輸入>0 的整數"
        */
        
    }
}