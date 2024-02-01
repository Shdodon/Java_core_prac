package lesson2_hw;

//Написать функцию, возвращающую истину,
// если в переданном массиве есть два соседних элемента,
// с нулевым значением.
public class Task3 {

    public static boolean checkZero(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == 0 && array[i] == array[i + 1]) {
                flag = true;
                break;
            } else flag = false;

        }
        return flag;
    }
}
