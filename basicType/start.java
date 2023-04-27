public class Hello{
    public static void main(String[] args){
        int number1,number2;
        float numeral;
        number1 = 7;
        number2 = 4;
        numeral = 3.14159f; // float add of "f" or "F"
        
        float  result = number1 +numeral;
        System.out.println(result);
        
        result = (float)number1/(float)number2;
        
        System.out.println(result);
        int results= (int)(number1/numeral);
        String a="Hello world.";
        
       
        System.out.println(a+number1);
        System.out.println("Cycle is :"+numeral);
        System.out.println(results);
    
    }
}