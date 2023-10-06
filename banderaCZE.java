import java.awt.*;
public class banderaCZE {
    public static int[][] createCzeFlag(int height, int width){
        int[][] flag= new int[height][width];
        int rowInt=0;
        int rowEnd=0;
        int rowIntTwo=0;
        int rowEndTwo=0;

        rowInt=(int)(height*0);
        rowEnd=(int)(height*0.5);
        rowIntTwo=(int)(width*0);
        rowEndTwo=(int)(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo; cell<rowEndTwo; cell++){
                flag[row][cell]=Main.COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowIntTwo=(int)(width*0);
        rowEndTwo=(int)(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo; cell<rowEndTwo; cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowEnd=(int)(height*0.5);
        rowInt=height*0;
        rowIntTwo=0;
        rowEndTwo=0;
        for (int row=rowInt; row<rowEnd; row++){
            rowEndTwo++;
            for (int cell=rowIntTwo; cell<rowEndTwo; cell++){
                flag[row][cell]=Main.COLOR_BLUE;
                flag[height-1-row][cell]=Main.COLOR_BLUE;
            }
        }


        return flag;
    }

    public static void main(String[] args) {
        int[][] flag={};
        flag=createCzeFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }
}
