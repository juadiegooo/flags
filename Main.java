import java.awt.*;

public class Main {
    public static final int COLOR_YELLOW=new Color(250,201,20).getRGB();
    public static final int COLOR_BLUE=new Color(17,15,99).getRGB();
    public static final int COLOR_RED=new Color(196,0,15).getRGB();
    public static final int COLOR_BLACK=new Color(5,5,5).getRGB();
    public static final int COLOR_WHITE=new Color(255,255,255).getRGB();
    public static final int COLOR_GREEN=new Color(35,138,51).getRGB();

    public static int[][] createCOLFlag(int height,int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowEnd=0;

        rowInt=0;
        rowEnd=(int)(height*0.50);
        for (int row=rowInt; row< rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++)
                flag[row][cell]=COLOR_YELLOW;
        }

        rowInt=(int)(height*0.50);
        rowEnd=(int)(height*0.75);
        for (int row=rowInt; row< rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++)
                flag[row][cell]=COLOR_BLUE;
        }

        rowInt=(int)(height*0.75);
        rowEnd=(int)(height);
        for (int row=rowInt; row< rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++)
                flag[row][cell]=COLOR_RED;
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] flag={};
        flag=createCOLFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createCOLFlag(12,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createCOLFlag(24,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createCOLFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }


}