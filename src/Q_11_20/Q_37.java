package Q_11_20;

public class Q_37 {

    public static void main(String[] args) {
        int [] intArr = {15,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
//      let's print to see the result
        for (int x : intArr ) {
            System.out.print(x + ", ");
        }
    }
}
//What are the values of each element in intArr
// after this code has executed?
//A.	15, 60, 45, 90, 75
//B.	15, 90, 45, 90, 75
//C.	15, 30, 75, 60, 90
//D.	15, 30, 90, 60, 90
//E.	15, 4, 45, 60, 90
//Answer C
