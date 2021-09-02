import java.util.Scanner;

public class Goods2 {
    private String name;
    private int price;
    private int numberOfStock;
    private int sold;


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Goods2[] arr = new Goods2[3];
        for (int i = 0; i < arr.length; i++) {
            String name = sc.next();
            int price = sc.nextInt();
            int numberOfStock = sc.nextInt();
            int sold = sc.nextInt();
            arr[i]= new Goods(name, price, numberOfStock, sold);
            System.out.print(arr[i].getName()+" ");
        }
    }
        class Goods {
            private String name;
            private int price;
            private int numberOfStock;
            private int sold;

    Goods(String n, int p, int nStock, int s){
        name= n;
        price= p;
        numberOfStock = nStock;
        sold=s;
    }
    String getName() {return name;}
    int getPrice() {return price;}
    int getNumberOfStock() {return numberOfStock;}
    int getSold() {return sold;}//메소드
    }
}
