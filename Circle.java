public class Circle {
    int radius;//10
    String name;//자바피자

    public Circle(int radius, String name){
        this.radius=radius;//this 는 전역변수를 가리킴 헷갈리지않게하기위해.
        this.name=name;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String args[]){
        Circle pizza = new Circle(10, "자바피자");

        double area = pizza.getArea();
        System.out.print(pizza.name+"의 면적은"+ area);
    }
}
