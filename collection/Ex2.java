import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Ex2 {
    public static void main(String[] args) {
        
        Order[] x = new Order[5];
        x[0] = new Order("java", 1, 94);
        x[1] = new Order("C#", 2, 88);
        x[2] = new Order("python", 3, 98);
        x[3] = new Order("visual Basic", 8, 79);
        x[4] = new Order("javascript", 10, 77);
        
        var list = new ArrayList<Order>(Arrays.asList(x));
        
        Stream<Order> s = list.stream();
        
        s
        .filter(b -> b.getScore() > 80) // filter() 內部可以看做是if 內布林值的判斷式
        .forEach(t -> System.out.println(t.show()));
    }
}

class Order {
    private String name;
    private Integer id;
    private Integer score;
    
    public Order(String name, Integer id, Integer score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }
    public Integer getScore() {
        return score;
    }
    public String show() {
        
        return "name: " + name + ", id: " + id + ", score: " + score;
        
    }
}