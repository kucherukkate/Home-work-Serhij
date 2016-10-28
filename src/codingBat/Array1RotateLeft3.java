package codingBat;

/**
 * Created by Svetlana on 26.10.2016.
 */
public class Array1RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int x = nums [0];
        int y = nums [1];
        int z = nums [2];


        nums [0] = y;
        nums [1] = z;
        nums [2] = x;


        return nums;


    }
}
