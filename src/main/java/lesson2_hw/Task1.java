package lesson2_hw;
/*
Написать метод, возвращающий количество чётных элементов массива.
countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
 */
public class Task1 {


    public static int countNum(int[] array){
        int count = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]%2 == 0){
                count++;
            }
        }
        return count;
    }
}
