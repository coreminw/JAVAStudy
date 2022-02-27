import java.util.Scanner;

public abstract class GameObject {
    protected int distance;//한번 이동 거리
    protected int x,y;//현재 위치(화면 맵 상의 위치)
    public GameObject(int startX, int startY, int distance){
        this.x=startX;
        this.y=startY;
        this.distance=distance;
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public boolean collide(GameObject p){//이 객체가 객체 p와 충돌했으면 true 리턴
        if(this.x == p.getX() && this.y== p.getY())
            return true;
        else
            return false;
    }
    protected abstract void move();
    protected abstract char getShape();
}
class Bear{
    Bear(){
        Scanner sc= new Scanner(System.in);
        while(true) {
            String z = sc.next();

        }
    }
}
class Fish{

}
public class BearFishGame {

    public static void main(String[] args) {

        System.out.println("**Bear의 Fish 먹기 게임을 시작합니다.**");
        String[][] arr = new String[10][20];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]="-";
            }
        arr[0][0]= "B";
        arr[r1][r2]="@";//random하게 찾아보기..집에서

        }
    }
}
