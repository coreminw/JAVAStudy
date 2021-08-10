import java.util.Scanner;

public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 3개 입력");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if((num3 > num2 && num2 > num1) || (num1 > num2 && num2 > num3))
            System.out.println("중간 값은"+num2);
        else if((num2 > num3 && num3 > num1)|| (num1 > num3 && num3 > num2))
            System.out.println("중간 값은"+num3);
        else if((num2 > num1 && num1 > num3)||(num3 > num1 && num1 > num2))
            System.out.println("중간 값은"+num1);
        else
            System.out.println("흠냐링..");

    }
}
