package Q_11_20;

public class Q_35 {


    public static void main(String[] args) {

        int nums1[] = {1, 2, 3};
        int nums2[] = {1, 2, 3, 4, 5};
        nums2  = nums1;
        for (int x : nums2) {
            System.out.print(x + ": ");
            //what is the result?
        }
    }
}
