import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String args[]) {

        while(true){
        Scanner in = new Scanner(System.in);

        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
        System.out.print("철수>>");
        String a = in.next();

        System.out.print("영희>>");
        String b = in.next();

        if (a.equals(b))
            System.out.println("철수와 영희는 비겼습니다.");
        else if (((a.equals("가위")) && (b.equals("바위"))) || ((a.equals("바위")) && (b.equals("보"))) || ((a.equals("보")) && (b.equals("가위"))))
            System.out.println("승자는 영희입니다.");
        else if (((b.equals("가위")) && (a.equals("바위"))) || ((b.equals("바위")) && (a.equals("보"))) || ((b.equals("보")) && (a.equals("가위"))))
            System.out.println("승자는 철수입니다.");
        else
            System.out.println("잘못된 입력입니다.");


            System.out.println("게임을 계속하시려면 yes를 입력하시고, 그만하려면 no을 입력하세요");
            String sc = in.next();
            if (sc.equals("yes"))
                System.out.println("가위바위보 시작");
            continue;
        }
        if (sc.equals("no"))
            break;

    }

}
