import java.util.Scanner;

public class MyExp {
    int base;
    int exp;

    int getValue(){
        int a=1;
        for(int i=0; i<exp; i++){
            a=a*base;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         MyExp n= new MyExp();
         n.base=sc.nextInt();
         n.exp=sc.nextInt();

        System.out.print(n.base+"의"+n.exp+"승="+n.getValue());
    }
}
