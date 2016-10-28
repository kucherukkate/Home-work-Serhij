package week2HomeWork;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Svetlana on 26.10.2016.
 */
/*3) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй */
    public class ArrayUtils3 {
    public int [] raplaceArray (int [] mas){
    int size = mas.length;
    int [] nums = new int [size];
    for (int i = 0; i < mas.length; i++) {
       nums [i] = mas [i];

        }
        return nums;
    }
 /*4) Посчитать сколько цифр(цифра задается пользователем) в массиве*/
 public int [] counter (int [] mas) {
     int size = mas.length;
     for (int i = 0; i < mas.length; i++) {
         System.out.println(size);
     }
     return mas;
 }

 /*6) Найти среднее арифметическое массива*/
 public int [] mind (int [] mas){
     int average = 0;
     if (mas.length >0){
         int sum = 0;
         for (int i = 0; i < mas.length; i++) {
             sum += mas [i];
         }
         average = sum/mas.length;
     }
     return mas;
 }

}


