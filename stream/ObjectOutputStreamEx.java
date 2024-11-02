public class ObjectOutputStreamEx {
    public static void main(String...args) {

        FileOutputStream fos = new FileOutputStream("file path");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.WriteObject(new Order());
        oos.WrtieObject(new Order());
    }
}

class Order implements Serializable {
    private String name;
    private int wordScore;
    private int excelScore;
    private int sum;

    //Omite - constructor , getter - setter, toString() = show()
        public Order(String name, int wordScore, int excelScore) {
        this.name = name;
        this.wordScore = wordScore;
        this.excelScore = excelScore;
        sum = wordScore + excelScore;
    }

    public void show() {
        System.out.println(
            "name:" + name +
            "wordScore:" + wordScore +
            "excelScore:" + excelscore +
            "sum:" + sum 
        );
    }
}