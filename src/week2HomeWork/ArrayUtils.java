package week2HomeWork;

/**
 * Created by Svetlana on 22.10.2016.
 */
public class ArrayUtils {
    /* створити метод що повертає String інтового масиву і зробити перевірку */
        public static String convert(int[] mus) {
            String result = "";
            for (int i = 0; i < mus.length; i++) {
                result = result + mus[i];
            }
            return result;
        }

    /*1) Найти минимальное и максимальное значения в массиве и вывести их на консоль*/

        public static void printMinAndMax(int[] mus) {
            int min, max;
            min = max = mus[0];
            for (int i = 0; i < mus.length; i++) {
                if (mus[i] > max) {
                    max = mus[i];
                }
                if (mus[i] < min) {
                    min = mus[i];
                }
            }
            System.out.println("Min is: " + min + "\nMax is: " + max);
        }
    /*2) Поменять местами наибольший и наименьший элементы в массиве */

        public static int [] getMinAndMax (int [] mas){
            int min, max;
            min = max= mas [0];
            int [] result = new int [2];
            for (int i = 1; i < mas.length; i ++) {
                if (mas[i] > max) {
                    max = mas[i];
                }
                if (mas[i] < min) {
                    min = mas[i];
                }
            }
            result [0] = min;
            result [1] = max;
            return result;
        }
        public static void changeMinAndMax (int [] mas){
            int [] minAndMax = getMinAndMax (mas);
            int indexOfMin = 0, indexOfMax = 0;
            for (int i = 0; i < mas.length; i++){
                if (mas [i] == minAndMax [0]){
                    indexOfMin = i;
                }
                if (mas [i] == minAndMax [1]){
                    indexOfMax = i;
                }
            }
            int temp = mas [indexOfMin];
            mas [indexOfMin] = mas [indexOfMax];
            mas [indexOfMax] = temp;
        }

    }


