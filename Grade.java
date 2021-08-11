import java.util.Scanner;

public class Grade {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("성적을 입력하세요");
        int grade= in.nextInt();

        if(grade>=90)
            System.out.print("A학점입니다.");
        else if(grade>=80)
            System.out.print("B학점입니다.");
        else if(grade>=70)
            System.out.print("C학점입니다.");
        else
            System.out.print("D학점입니다.");
   }
}
