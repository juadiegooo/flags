import java.awt.*;
public class banderaNOR {
        public static int[][] createNorFlag(int height, int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowEnd=0;
        int cellInt=0;
        int cellEnd=0;

        rowEnd=(int)(height*0.4);
        cellEnd=(int)(width*0.2);
        for (int row=0; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowEnd=(int)(height*0.45);
        cellInt=(int)(width*0.4);
        cellEnd=(width);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.55);
        rowEnd=(height);
        cellInt=(width*0);
        cellEnd=(int)(width*0.3);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.55);
        rowEnd=(height);
        cellInt=(int)(width*0.4);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.35);
        rowEnd=(int)(height*0.6);
        cellInt=(int)(width*0);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_WHITE;
            }
        }


        rowEnd=height;
        cellInt=(int)(width*0.2);
        cellEnd=(int)(width*0.45);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.45);
        rowEnd=(int)(height*0.5);
        cellInt=(int)(width*0);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_BLUE;
            }
        }

        rowEnd=height;
        cellInt=(int)(width*0.29);
        cellEnd=(int)(width*0.38);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=Main.COLOR_BLUE;
            }
        }
        return flag;
    }

        public static void main(String[] args) {
        int[][] flag={};
        flag=createNorFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }

}
