import java.util.Scanner;

public class test12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산>>");
        double num1 = sc.nextInt();
        String a = sc.next();
        double num2 = sc.nextInt();

        if (a.equals("+")) {
            double result = num1 + num2;
            System.out.print(num1 + a + num2 + "의결과는" + result);
        } else if (a.equals("*")) {
            double result = num1 * num2;
            System.out.print(num1 + a + num2 + "의결과는" + result);
        } else if (a.equals("/")) {
            if (num2 == 0)
                System.out.print("나눌 수 없습니다.");
            else {
                double result = num1 / num2;
                System.out.print(num1 + a + num2 + "의결과는" + result);
            }
        } else if (a.equals("-")) {
            double result = num1 - num2;
            System.out.print(num1 + a + num2 + "의결과는" + result);
        }
    }
}