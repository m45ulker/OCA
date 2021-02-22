package Q_112_139;

public class Q_123 {
}

    class Test123 {

      int a1;

        public static void doProduct(int a) {
            a = a * a;
        }

        public static void doString(String s) {
            s.concat(" " + s);
        }

        public static void main(String[] args) {

            Test123 item = new Test123();

            item.a1 = 11;           // -> 11
            String sb = "Hello";    // -> Hello
            Integer i = 10;         // -> 10
            doProduct(i);           // -> 10
            doString(sb);           // ->  Hello
            doProduct(item.a1);     // -> 121
            System.out.println(i + " "+ sb + " "+ item.a1);
        }
    }
/*
What is the result?
A. 10 Hello Hello 11
B. 10 Hello Hello 121
C. 100 Hello 121
D. 100 Hello Hello 121
E. 10 Hello 11

Answer: E
 */

// 2nd version

/*class Test6 {
    int a1;

    public static void doProduct(int a) {
        a = a * a;
    }
    public static void doString(StringBuilder s) {
        s.append(""+s);
    }

    public static void main(String[] args) {
        Test6 item= new Test6();
        item.a1=11;
        StringBuilder sb= new StringBuilder("Hello");
        Integer i=10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i+" "+sb+" "+item.a1);
    }
}*/
/*
 What is the result?
A. 10 Hello Hello 11
B. 10 Hello Hello 121
C. 100 Hello 121

Answer: A

 */



