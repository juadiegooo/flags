import java.awt.*;
public class banderaVEN {
    public static int[][] createVenFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;

        rowEnd = (int) (height * 0.35);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell=0;cell<flag[row].length;cell++){
                flag[row][cell]=Main.COLOR_YELLOW;
            }
        }

        rowInt=(int)(height*0.35);
        rowEnd=(int)(height*0.70);
        for (int row=rowInt;row<rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++){
                flag[row][cell]=Main.COLOR_BLUE;
            }
        }

        rowInt=(int)(height*0.70);
        rowEnd=(int)(height);
        for (int row=rowInt;row<rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        return flag;
    }


    public static void main(String[] args) {
        int[][] flag={};

        flag=createVenFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }
}
