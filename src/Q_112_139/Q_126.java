package Q_112_139;

public class Q_126 {


    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder ("Duke");
        String str1 = sb1.toString();

//      This is line 9. Insert code here

        String str2 = str1;

        System.out.print(str1 == str2); // Object equality needed.

/*
        Which code fragment, when inserted at line 9, enables the code to print true?

A. String str2=str1;    // This assigns one object to another object
B. String str2 = new String(str1);
C. String str2 = sb1.toString();
D. String str2 = "Duke";

Answer:A
 */

// 2nd version hersey aynu sadece Duke yerine Java yazilmis

// StringBuilder sb1 = new StringBuilder ("Java");
// String str1 = sb1.toString();
//// 9. // insert code here
//
// System.out.print(str1 == str2);

/*
Which code fragment, when inserted at line 9, enables the code to print true?

A. String str2=str1;
B. String str2 = new String(str1);
C. String str2 = sb1.toString();
D. String str2 = "Java";


 */
    }
}
