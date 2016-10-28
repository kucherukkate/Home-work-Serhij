package week2HomeWork;

/**
 * Created by Svetlana on 22.10.2016.
 */
public class Start {
    public static void main(String[] args) {
        /*int[] nums = {1, 2, 3, 5, -25, 13, -5};
        String x = ArrayUtils.convert(nums);
        System.out.println(x);

        ArrayUtils.printMinAndMax (nums);
        for (int i = 0; i < nums.length; i++){
            System.out.println(i + ":" + nums [i]);
        }
        ArrayUtils.changeMinAndMax (nums);
        for (int i = 0; i < nums.length; i++){
            System.out.println(i + ": " + nums [i]);
        }*/

        ArrayUtils3 arrayUtils3 = new ArrayUtils3();
        int [] mas = {1,2,3};
        arrayUtils3.raplaceArray(mas);
        for (int i = 0; i < mas.length ; i++) {
            System.out.println(mas [i]);

        }

        arrayUtils3.counter(mas);
        for (int i = 0; i < mas.length ; i++) {
            System.out.println(mas [i]);

        }
    }
}


