import java.util.Arrays;
public class Ex1 {
    public static void main(String[] args) {
        
        Order[] x = new Order[3];
        x[0] = new Order("java", 1, 94);
        x[1] = new Order("C#", 2, 88);
        x[2] = new Order("python", 3, 98);
        
        Arrays.sort(x, (o1, o2) -> Integer.compare(o1.getScore(), o2.getScore()));
        
        for(Order i: x) {
            System.out.println(i.show());
        }
        
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