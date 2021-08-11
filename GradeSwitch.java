import java.util.Scanner;

public class GradeSwitch {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("성적을 입력하세요");
        char grade = sc.next().charAt(0);

        switch(grade) {
            case 'A':
            case 'B':
                System.out.print("참 잘했다");
                break;
            case 'C':
            case 'D':
                System.out.print("노력해라");
                break;
            case 'F':
                System.out.print("재수강해라");
                break;
            default:
                System.out.print("잘못된 학점");

        }
    }
}
