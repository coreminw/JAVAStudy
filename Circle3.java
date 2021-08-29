class newCircle3 {
    int radius;

    public newCircle3(int radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}

public class Circle3{
    public static void main(String[] args) {
        newCircle3[] c = new newCircle3[5];

        for (int i = 0; i <c.length ; i++) {
            c[i]=new newCircle3(i);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].getArea()+ " ");
        }
    }
}
