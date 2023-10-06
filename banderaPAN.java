import java.awt.*;
public class banderaPAN {
    public static int[][] createPanFlag(int height, int width){
        int [][] flag=new int[height][width];
        int rowInt=0;
        int rowIntTwo=0;
        int rowEnd=0;
        int rowEndTwo=0;

        rowEnd=(int)(height*0.5);
        rowEndTwo=(int) (width*0.5);
        for(int row=0; row<rowEnd;row++){
            for (int cell=0;cell<(rowEndTwo);cell++){
                flag[row][cell]=Main.COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowIntTwo=(int) (width*0.5);
        rowEndTwo=(int) (width);
        for(int row=rowInt; row<rowEnd;row++){
            for (int cell=rowIntTwo;cell<(rowEndTwo);cell++){
                flag[row][cell]=Main.COLOR_WHITE;
            }
        }

        rowInt=(int)(height);
        rowEnd=(int)(height*0.5);
        rowIntTwo=(int) (width*0.5);
        rowEndTwo=(int) (width);
        for(int row=0; row<rowEnd;row++){
            for (int cell=rowIntTwo;cell< rowEndTwo;cell++){
                flag[row][cell]=Main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowIntTwo=(int) (width);
        rowEndTwo=(int) (width*0.5);
        for(int row=rowInt; row<rowEnd;row++){
            for (int cell=0;cell< rowEndTwo;cell++){
                flag[row][cell]=Main.COLOR_BLUE;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int[][] flag={};
        flag=createPanFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

    }
}
