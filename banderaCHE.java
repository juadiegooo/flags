import java.awt.*;
public class banderaCHE {
    public static int[][] createCheFlag(int height, int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowEnd=0;
        int cellInt=0;
        int cellEnd=0;

        rowEnd=height;
        cellEnd=width;
        for (int row=0; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_WHITE;
            }
        }

        rowEnd=(int)(height*0.1);
        cellEnd=width;
        for (int row=0; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.1);
        rowEnd=(int)(height*0.35);
        cellEnd=(int)(width*0.4);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.35);
        rowEnd=(int)(height*0.6);
        cellEnd=(int)(width*0.20);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.6);
        rowEnd=(int)(height*0.9);
        cellEnd=(int)(width*0.4);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowInt=(int) (height*0.9);
        rowEnd=height;
        cellEnd=width;
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.1);
        rowEnd=(int)(height*0.35);
        cellInt=(int)(width*0.6);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.35);
        rowEnd=(int)(height*0.6);
        cellInt=(int)(width*0.8);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.6);
        rowEnd=(int)(height*0.9);
        cellInt=(int)(width*0.6);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }


        return flag;

    }
    public static void main(String[] args) {
        int[][] flag={};
        flag=createCheFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }
}
