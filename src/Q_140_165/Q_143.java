package Q_140_165;

public class Q_143 {





    public static void main(String[] args) {
        boolean a= new Boolean(Boolean.valueOf(args[0])); //iki deger alir icine string ve boolean
        boolean b= new Boolean(args[1]);
        System.out.print(a +" "  + b);
    }

}

/*
And given the commands:

javac Test.java
java Test 1 null   ////butun sayilari ve null i  false olarak algiliyor

What is the result?
 A. 1 null
B. true false
C. false false
D. true true
E. A ClassCastException is thrown at runtime.

 Answer: C

 second version is same

 Thrid version

 public static void main(String[] args) {
        boolean a= new Boolean(Boolean.valueOf(args[0]));
        boolean b= new Boolean(args[1]);
        System.out.print(a +" "  + b);

        And given the commands:

javac Test.java
java Test 1 null

What is the result?
 A. True null
B. true false
C. false false
D. true true
E. A ClassCastException is thrown at runtime.
answer?


    }
 */


