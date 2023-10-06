import java.awt.*;
public class banderaCHL {
    public static int[][] createChiFlag(int height, int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowIntTwo=0;
        int rowEnd=0;
        int rowEndTwo=0;

        rowEnd=(int)(height*0.5);
        rowEndTwo=(int)(width*0.35);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo;cell<rowEndTwo;cell++){
                flag[row][cell]=Main.COLOR_BLUE;
            }
        }

        rowEnd=(int)(height*0.5);
        rowIntTwo=(int)(width*0.35);
        rowEndTwo=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo;cell<rowEndTwo;cell++){
                flag[row][cell]=Main.COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowEndTwo=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=0;cell<rowEndTwo;cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int[][] flag={};
        flag=createChiFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }



}
