package lesson2_hw;

/*
Написать функцию, возвращающую разницу между самым большим и
самым маленьким элементами переданного не пустого массива.
 */
public class Task2 {

    public static int max(int[] array) {
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static int min(int[] array, int maxNum){
        int minNum = maxNum;
        for (int i = 0; i < array.length; i++) {
            if(minNum > array[i]){
                minNum = array[i];
            }
        }
        return minNum;
    }

    public static int diferent(int[] array) {
       int max = max(array);
       int min =  min(array,max);
       return max - min;
    }
}
