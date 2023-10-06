import java.awt.*;
public class banderaKWT {
    public static int[][] createKWTFLAG(int heigth, int width) {
        int[][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = (int) ((double) heigth * 0.35);
        int cellIni = 0;
        int cellEnd = width;

        int row;
        int cell;
        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = Main.COLOR_GREEN;
            }
        }

        rowIni = rowEnd;
        rowEnd = (int) ((double) heigth * 0.7);
        cellIni = 0;
        cellEnd = width;

        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = Main.COLOR_WHITE;
            }
        }

        rowIni = rowEnd;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = Main.COLOR_RED;
            }
        }

        rowIni = 0;
        rowEnd = (int) ((double) heigth * 0.5);
        cellIni = 0;
        cellEnd = 0;

        for (row = rowIni; row < rowEnd; ++row) {
            ++cellEnd;

            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = Main.COLOR_BLACK;
                flag[heigth - 1 - row][cell] = Main.COLOR_BLACK;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[][] flag={};
        flag=createKWTFLAG(24, 40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }
}

