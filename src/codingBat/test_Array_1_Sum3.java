package codingBat;

/**
 * Created by Svetlana on 26.10.2016.
 */
public class test_Array_1_Sum3 {
    public static void main(String[] args) {
        int [] input1 = {1,2,3};
        int expected1 = 6;
        int actual = array_1_Sum3.sum3 (input1);
        System.out.println("mas = " + array_1_Sum3.convert(input1));
        System.out.println("expected = " + expected1);
        System.out.println(expected1 == actual);
    }
    int [] in1 ={1, 2, 3};    int exp1 =   6;
    int [] in2 ={5, 11,2};    int exp2 =   18;
    int [] in3 ={7, 0, 0};    int exp3 =   7;
    int [] in4 ={1, 2, 1};    int exp4 =   4;
    int [] in5 ={1, 1, 1};    int exp5 =   3;
    int [] in6 ={2, 7, 2};    int exp6 =   11;
}
