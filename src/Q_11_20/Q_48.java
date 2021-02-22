package Q_11_20;

import java.util.ArrayList;
import java.util.List;

public class Q_48 {


    public static void main(String[] args) {
        List colors = new ArrayList<>();   //type eklenmiyorsa herhangi bir type yazabiliriz.
                                            // List<Object> veya List<?> yazilabilir
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3,"cyan");

        System.out.println(colors);
    }
}

//What is the result?
//A.	[green, red, yellow, cyan]
//B.	[green, blue, yellow, cyan]
//C.	[green, red, cyan, yellow]
//D.	An IndexOutOfBoundsException is thrown at runtime.
//Answer: D


//Canvasta:
//
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("green");
//        colors.add("red");
//        colors.add("blue");
//        colors.add("yellow");
//        colors.add(3,"cyan");
//
//        System.out.println(colors);

//3. version
//        List<String> colors = new ArrayList<>();
//        colors.add("green");
//        colors.add("red");
//        colors.add("blue");
//        colors.add("yellow");
//        colors.remove(2);
//        colors.add(3,"cyan");
//
//        System.out.println(colors);

