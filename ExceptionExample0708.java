import java.util.Scanner;

public class ExceptionExample0708 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a=0;//나뉨수
        int b=0;//나눗수

        System.out.println("나뉨 수 입력");
        a= sc.nextInt();
        System.out.println("나눗 수 입력");
        b= sc.nextInt();

        try {
            System.out.println(a+"를"+b+"로 나누면"+a/b);
        }catch {
            System.out.println("0으로 나누기 불가");
        }

    }
}
