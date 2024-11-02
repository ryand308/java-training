public class ObjectInputStreamEx {
    public static void main(String[] args) {

        FileInputStream fis = new FileInputStream("file path");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // ((Order)ois.readObject()).show();  顯示單筆 show() 自定義方法類似 toString()
        while(true) {
            try{
                ((Order)ois.readObject()).show();
            }
            catch(EOFException e) {
                System.out.println(e);
            }
        }
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