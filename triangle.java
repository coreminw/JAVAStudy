import java.util.Scanner;

public class practice {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개를 입력하세요:");

        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();


        if(num1>num2 && num1>num3){
            if(num2+num3>num1)
                System.out.print("삼각형이 됩니다.");
            else
                System.out.print("삼각형이 되지않습니다.");
        }
        else if(num2>num1 && num2>num3){
            if(num1+num3>num2)
                System.out.print("삼각형이 됩니다.");
            else
                System.out.print("삼각형이 되지않습니다.");
        }
        else
        if(num1+num2>num3)
            System.out.print("삼각형이 됩니다.");
        else
            System.out.print("삼각형이 되지않습니다.");

    }
}
