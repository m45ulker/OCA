package Q_112_139;

import java.time.LocalDate;

public class Q_131 {

    //Given the code fragment:

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 01,32);
        date.plusDays(10);
        System.out.println(date);
    }

   /* What is the result?

        A. 2012-02-10
        B. 2012-02-11
        C. Compilation fails
        D. A DateTimeException is thrown at runtime.

        Answer:D

    */

   /*
   Q_144

    Given the code fragment:
    public static void main (String [] args) {
    LocalDate date = LocalDate.of (2012, 01, 32);
     date.plusDays (10);
     System.out.println (date);
      What is the result?
      A. 2012-02-10
      B. 2012-02-11
      C. Compilation fails
      D. A DateTimeException is thrown at runtime.

    */
}
