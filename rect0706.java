import java.util.Scanner;

public class rect0706 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int x= 100;
    int y= 200;

    System.out.println("직사각형을 구성하는 두점 (x1, y1)를 입력하시오");
    int rectx1 = sc.nextInt();
    int recty1 = sc.nextInt();

    System.out.println("직사각형을 구성하는 두점 (x2, y2)를 입력하시오");
    int rectx2 = sc.nextInt();
    int recty2 = sc.nextInt();
        inRect( x, y, rectx1, recty1, rectx2, recty2);

        if(inRect( x,y, rectx1, recty1, rectx2, recty2))
            System.out.println("됩니다.");
        else
            System.out.println("안됩니다.");

    }
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if((x >= rectx1 && x<= rectx2) &&(y >= recty1 && y <= recty2))
            return true;
        else return false;

    }
}

