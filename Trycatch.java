import java.util.ArrayList;

public class TryCatch {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        
        Integer[] x = {11, 23, 41, 56, 97};
        for(Integer i: x) {
            list.add(i);
        }
        try {
            // forEach 也可以使用。為故意製造出 ArrayOutOfBoundsException
            for(int i = 0; i <= list.size(); i++) {
                System.out.println(list.get(i));
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
            System.out.println("出現未定義行為。");
        }finally {
            System.out.println("test print finally local.");
        }
    }
}