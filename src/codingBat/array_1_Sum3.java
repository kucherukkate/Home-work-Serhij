package codingBat;

/**
 * Created by Svetlana on 26.10.2016.
 */
public class array_1_Sum3 {
    /*Given an array of ints length 3, return the sum of all the elements.*/
    public static int sum3(int[] nums) {
        int sum = nums[0] + nums[1] + nums[2];
        return sum;

    }
    public static String convert (int [] mas) {
        String res = "";
        for (int i = 0; i < mas.length; i++) {
            res = res + mas[i] + " ";

        }
        return res;
    }
}
