import java.util.Scanner;

public class Test16 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String[] arr={"가위","바위","보"};
        //n은 0,1,2중에서 랜덤하게 결정

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while(true) {
            int n= (int)(Math.random()*3);
            System.out.print("가위 바위 보!>>");
            String s = sc.next();
            char c = s.charAt(0);

            if(s.equals("보")) {
                if (arr[n].equals("가위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + arr[n] + ",컴퓨터가 이겼습니다.");
                if (arr[n].equals("바위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + arr[n] + ",사용자가 이겼습니다.");
                if (arr[n].equals("보"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + arr[n] + ",비겼습니다.");
            } else if (s.equals("가위")) {
                if (arr[n].equals("바위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + arr[n] + ",컴퓨터가 이겼습니다.");
                if (arr[n].equals("보"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + arr[n] + ",사용자가 이겼습니다.");
                if (arr[n].equals("가위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + arr[n] + ",비겼습니다.");
            } else if (s.equals("바위")) {
                if (arr[n].equals("보"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + arr[n] + ",컴퓨터가 이겼습니다.");
                if (arr[n].equals("가위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + arr[n] + ",사용자가 이겼습니다.");
                if (arr[n].equals("바위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + arr[n] + ",비겼습니다.");
            } else if (s.equals("그만")) {
                break;
            }else{
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
        }
        System.out.println("게임을 종료합니다.");
    }
}
