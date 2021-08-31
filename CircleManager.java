import java.util.Scanner;

class Circle2 {
    private double x, y;
    private int radius;

    public Circle2(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("(" + x + "," + y + ")" + radius);
    }

    public int radius() {
        return radius;
    }
}
    class CircleManager{
        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            Circle2[] c= new Circle2[3];
            int max=0;
            for(int i=0; i<c.length; i++){
                System.out.print("x, y, radius>>");
                double x= sc.nextDouble();
                double y= sc.nextDouble();
                int radius= sc.nextInt();
                c[i]=new Circle2(x,y,radius);
            }
            for(int i=0; i<c.length; i++){
                if(max<c[i].radius())
                    max=c[i].radius();
            }
            for(int i=0; i<c.length; i++) {
                if (max == c[i].radius())
                    c[i].show();
                }
            }
        }