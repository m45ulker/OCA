package Q_11_20;

public class Q_23 {

    public static void main(String[] args) {
        // given the code fragment
        int[] stack = { 10, 20, 30 };
        int size = 3;
        int idx = 0;

//    In order to print "The Top Element: 30",
//    insert code here

        do {
            idx++;
        } while (idx < size - 1);

//     and here

        System.out.println("The Top Element: " + stack[idx]);
    }
}
        /*
         * A. do{idx++;}while(idx>=size);
         * B. while(idx<size){idx++;}
         * C. do{ idx++;}while(idx<size-1);  <--Answer
         * D. do{idx++;} while(idx<=size);
         * E. while(idx<=size-1){idx++;}
         */
