package Q_11_20;

public class Q_54 {

    public static void main(String[] args) {
        String [][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr [i].length; j++){
                System.out.print(arr[i][j]+ " ");
                if(arr[i][j].equals("B")){
                    break;
                }
            }
            continue;
        }
    }
}
        /*
        What is the result?
    A. A B C
    B. A B C D E
    C. A B D E
    D. Compilation fails

    Answer: C
         */
