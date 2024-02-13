package lesson5_hw;

import java.util.ArrayList;
import java.util.List;

    public class Task2 {
        static char[] gameField = new char[] {  'O', '.', 'X',
                '.', '?', 'X',
                'O', '.', 'X' };

        public static void saveAndLoadGameField() {
            GameField field1 = new GameField(gameField);
            System.out.println("Начальное состояние игровго поля: ");
            field1.printGameField();
            field1.exportGameFieldCondition();
            System.out.println("Игровое поле после сохранения и загрузки: ");
            field1.importGameFieldCondition();
            field1.printGameField();
        }
    }

