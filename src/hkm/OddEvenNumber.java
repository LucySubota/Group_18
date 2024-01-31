package hkm;

public class OddEvenNumber {
    /*
    * Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
*/
    public static void main(String[] args) {
        System.out.println(identifyOddEven(17));

    }
    public  static  String  identifyOddEven( int  n ) {
        return  n%2==0 ? "Even" : "odd" ;
    }

}
