import java.util.Scanner;

public class money {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);

        System.out.println("금액을 입력하세요.");
        int a = in.nextInt();

        int b,c,d,e,f,g,h;

        b= a/50000;
        c= (a%50000)/10000;
        d= ((a%50000)%10000)/1000;
        e= (((a%50000)%10000)%1000)/100;
        f= ((((a%50000)%10000)%1000)%100)/50;
        g= (((((a%50000)%10000)%1000)%100)%50)/10;
        h= ((((((a%50000)%10000)%1000)%100)%50)%10)/1;

        System.out.println("5만원권"+b+"매");
        System.out.println("만원권"+c+"매");
        System.out.println("천원권"+d+"매");
        System.out.println("백원"+e+"매");
        System.out.println("오십원"+f+"매");
        System.out.println("십원"+g+"매");
        System.out.println("일권"+h+"매");
    }
}
