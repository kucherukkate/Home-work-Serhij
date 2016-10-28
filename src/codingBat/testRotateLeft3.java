package codingBat;

/**
 * Created by Svetlana on 26.10.2016.
 */
public class testRotateLeft3 {
    public static void main(String[] args) {
       Array1RotateLeft3 array1RotateLeft3 = new Array1RotateLeft3();
        int [] mas = {1,2,3};
        array1RotateLeft3.rotateLeft3(mas);
        for (int i = 0; i < mas.length ; i++) {
            System.out.println(mas [i]);

        }
    }
}
