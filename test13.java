import java.util.Scanner;

public class test13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산>>");
        double num1 = sc.nextDouble();
        String a = sc.next();
        double num2 = sc.nextDouble();
        double result= 0;

        switch(a){
            case "*" :
              result = num1+num2;
                System.out.print(num1+a+num2+"는"+result);
                break;
            case "-" :
                result = num1-num2;
                System.out.print(num1+a+num2+"는"+result);
                break;
            case "+" :
                result = num1+num2;
                System.out.print(num1+a+num2+"는"+result);
                break;
            case "/" :
                if(num2==0)
                    System.out.print("이건 안돼용..");
                else {
                    result = num1 / num2;
                    System.out.print(num1 + a + num2 + "는" + result);
                }
                break;
            default:
                System.out.print("사칙연산이 아닙니다.");
        }

        sc.close();
    }
}
