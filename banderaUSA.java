import java.awt.*;
public class banderaUSA {
    public static int[][] createUsaFlag(int height, int width){
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

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowIntTwo=(int)(width*0);
        rowEndTwo=(int)(width*0.35);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo;cell<rowEndTwo;cell++){
               if (row%2==0){
                   flag[row][cell]=Main.COLOR_RED;
               }else {
                   flag[row][cell]=Main.COLOR_WHITE;
               }
            }
        }

        rowInt=(int)(height*0);
        rowEnd=(int)(height);
        rowIntTwo=(int)(width*0.35);
        rowEndTwo=(int)(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo;cell<rowEndTwo;cell++){
                if (row%2==0){
                    flag[row][cell]=Main.COLOR_RED;
                }else {
                    flag[row][cell]=Main.COLOR_WHITE;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] flag={};
        flag=createUsaFlag( 24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }



}
