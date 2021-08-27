public class CarTest {
    public static void main(String[] args) {
        Car carObject;
        carObject = new Car();

        carObject.set(15);
        System.out.println(carObject.get());

        carObject.set(8);
        System.out.println(carObject.get());
    }
}
class Car{
    private int fuel =0;

    void set(int input1){
        if(input1<10){
            System.out.println("input1 value less than 10");
        }
        else{
            fuel = input1;
        }
    }
    int get(){
        return fuel;
    }
}