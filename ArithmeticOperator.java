import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String args[]){
        int time;
        int hour;
        int minute;
        int second;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");

        time= sc.nextInt();
        second= time%60;
        minute= (time/60)%60;
        hour=(time/60)/60;

        System.out.println(time+"초는");
        System.out.println(hour+"시간");
        System.out.println(minute+"분");
        System.out.println(second+"초입니다");

    }
}
