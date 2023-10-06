import java.awt.*;
public class banderaPOL {
    public static int[][] createPolFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;
        rowEnd = (int) (height * 0.5);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = Main.COLOR_WHITE;
            }
        }

        rowInt = (int) (height * 0.5);
        rowEnd = (int) (height);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = Main.COLOR_RED;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] flag={};
        flag=createPolFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }
}

