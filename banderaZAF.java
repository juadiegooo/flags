import java.awt.*;
public class banderaZAF {
    public static int[][] createZAFFLAG(int heigth, int width){
        int[][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;

        //COLOR RED
        rowIni = 0;
        rowEnd = (int)(heigth*0.35);
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = Main.COLOR_RED;
            }
        }

        //COLOR WHITE
        rowIni = rowEnd;
        rowEnd = (int)(heigth*0.7);
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = Main.COLOR_WHITE;
            }
        }

        //COLOR BLUE
        rowIni = rowEnd;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = Main.COLOR_BLUE;
            }
        }

        //COLOR WHITE >
        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 1;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = Main.COLOR_WHITE;
                flag[heigth-1-row][cell] = Main.COLOR_WHITE;
            }
        }

        //COLOR GREEN >
        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = Main.COLOR_GREEN;
                flag[heigth-1-row][cell] = Main.COLOR_GREEN;
            }
        }

        //COLOR GREEN --
        rowIni = (int)(heigth*0.5)-1;
        rowEnd = rowIni+2;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = Main.COLOR_GREEN;
            }
        }

        //COLOR YELLOW >
        rowIni = 2;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = Main.COLOR_YELLOW;
                flag[heigth-1-row][cell] = Main.COLOR_YELLOW;
            }
        }

        //COLOR BLACK >
        rowIni = 3;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = Main.COLOR_BLACK;
                flag[heigth-1-row][cell] = Main.COLOR_BLACK;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        int[][] flag={};
        flag=createZAFFLAG(24, 40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }
}
