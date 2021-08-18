// 3 6 9 를 만드는 프로그램 3이나 6이나 9가 한번 나오면 박수짝, 3,6,9가 두개나오면 박수짝짝
import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("1~99사이의 정수를 입력하시오");
        int num = in.nextInt();

        if((num<10) && ((num%3) == 0))//1의자리일때
            System.out.println("박수짝");
        else if(((num%30)==3) || ((num%30)==6) || ((num%30)==9))
            System.out.println("박수짝짝");
        else if(((num%10)==3) || ((num%10)==6) || ((num%10)==9))
        System.out.println("박수짝");
        else if(num%30==0)
            System.out.println("박수짝");
        else
            System.out.println("wrong");


    }


}
