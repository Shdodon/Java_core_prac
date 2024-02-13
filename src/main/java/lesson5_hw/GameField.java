package lesson5_hw;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class GameField {
    private int[] gameFieldCondition = new int[9];
    private char[] gameField;
    public GameField(char[] gameField) {
        this.gameField = gameField;

        convertCharToCondition();
    }


    public void printGameField() {
        for (int i = 0; i < gameField.length; i++) {
            System.out.print(gameField[i] + " ");
            if ((i + 1) % 3 == 0) System.out.println();
        }
    }


    public void printGameFieldConditions() {
        for (int i = 0; i < gameFieldCondition.length; i++) {
            System.out.print(gameFieldCondition[i] + " ");
            if ((i + 1) % 3 == 0) System.out.println();
        }
    }


    private void convertConditionToChar() {
        for (int i = 0; i < gameFieldCondition.length; i++) {
            switch (gameFieldCondition[i]) {
                case 0 -> this.gameField[i] = '.';
                case 1 -> this.gameFieldCondition[i] = 'X';
                case 2 -> this.gameFieldCondition[i] = 'O';
                default -> this.gameFieldCondition[i] = '?';
            }
        }
    }


    private void convertCharToCondition() {
        for (int i = 0; i < gameField.length; i++) {
            switch (gameField[i]) {
                case '.' -> this.gameFieldCondition[i] = 0;
                case 'X' -> this.gameFieldCondition[i] = 1;
                case 'O' -> this.gameFieldCondition[i] = 2;
                default -> this.gameFieldCondition[i] = 3;
            }
        }
    }

    public void importGameFieldCondition() {
        Arrays.fill(gameFieldCondition, 0);
        int gameFieldCompressed = readFromFile();
        convertIntToArray(gameFieldCompressed);
        reverseArray();
        convertConditionToChar();
    }


    public void exportGameFieldCondition() {

        int gameFieldCompressed = convertArrayToInt();

        writeToFile(gameFieldCompressed);
    }

    private int convertArrayToInt() {

        int gameFieldCompressed = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                switch (i) {
                    case 0 -> {

                        gameFieldCompressed <<= 1;
                        if (gameFieldCondition[j] == 1) {
                            gameFieldCompressed += 1;
                        }
                    }
                    case 1 -> {

                        gameFieldCompressed <<= 1;
                        if (gameFieldCondition[j] == 2) {
                            gameFieldCompressed += 1;
                        }
                    }
                    case 2 -> {

                        gameFieldCompressed <<= 1;
                        if (gameFieldCondition[j] == 3) {
                            gameFieldCompressed += 1;
                        }
                    }
                }
            }
        }
        return gameFieldCompressed;
    }

    private void convertIntToArray(int gameFieldCompressed) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                switch (i) {
                    case 0 -> {

                        if ((gameFieldCompressed & 1) == 1) {
                            gameFieldCondition[j] = 3;
                        }
                        gameFieldCompressed >>= 1;
                    }
                    case 1 -> {

                        if ((gameFieldCompressed & 1) == 1) {
                            gameFieldCondition[j] = 2;
                        }
                        gameFieldCompressed >>= 1;
                    }
                    case 2 -> {

                        if ((gameFieldCompressed & 1) == 1) {
                            gameFieldCondition[j] = 1;
                        }
                        gameFieldCompressed >>= 1;
                    }
                }
            }
        }
    }

    private void writeToFile(int gameFieldCompressed) {
        try {
            Path file = Paths.get("game_field.txt");
            if (!Files.exists(file)) Files.createFile(file);
            Files.writeString(file, String.valueOf(gameFieldCompressed), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private int readFromFile() {
        Path file = Paths.get("game_field.txt");
        try {
            return Integer.parseInt(Files.readString(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void reverseArray() {
        for(int i = 0; i < gameFieldCondition.length / 2; i++)
        {
            int temp = gameFieldCondition[i];
            gameFieldCondition[i] = gameFieldCondition[gameFieldCondition.length - i - 1];
            gameFieldCondition[gameFieldCondition.length - i - 1] = temp;
        }
    }
}