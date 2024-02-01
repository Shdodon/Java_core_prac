package lesson2_hw;

import static lesson2_hw.Task1.countNum;
import static lesson2_hw.Task3.checkZero;


public class Program {
    public static void main(String[] args) {


        int[] array0 = {2, 1, 2, 3, 4}; //3 //4-1 = 3 //false
        int[] array1 = {2, 2, 0}; //3 // 2-0=2 //false
        int[] array2 = {1, 3, 5}; //0 //5-1=4 //false
        int[] array3 = {1,2,3,0,0}; //true

        int count1 = countNum(array0);
        System.out.println(count1);
        int count2 = countNum(array1);
        System.out.println(count2);
        int count3 = countNum(array2);
        System.out.println(count3);


        int dif1 = Task2.diferent(array0);
        System.out.println(dif1);
        int dif2 = Task2.diferent(array1);
        System.out.println(dif2);
        int dif3 = Task2.diferent(array2);
        System.out.println(dif3);

        boolean checkArray0 = checkZero(array0);
        System.out.println(checkArray0);
        boolean checkArray1 = checkZero(array1);
        System.out.println(checkArray1);
        boolean checkArray2 = checkZero(array2);
        System.out.println(checkArray2);
        boolean checkArray3 = checkZero(array3);
        System.out.println(checkArray3);


    }
}
