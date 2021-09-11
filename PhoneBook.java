import java.util.Scanner;

public class PhoneBook { //행동하는 클래스 접근하는 클래스
    Scanner sc= new Scanner(System.in);
    Phone a= new Phone();

    PhoneBook(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
            a.name = sc.next();
            a.tel = sc.nextInt();
            a.phones[i][0]=a.name;
            a.phones[i][1]=String.valueOf(a.tel);
        }
        System.out.print("저장되었습니다...");

        a.run();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("인원수>>");
       int n= sc.nextInt();
        new PhoneBook(n);
    }
}
class Phone{
    Scanner sc2= new Scanner(System.in);
    String[][] phones = new String[3][2];

    public String name;
    public int tel;

    public void run() {
        while (true) {
            int i = 0;
            System.out.println("검색할 이름>>");
            this.name = sc2.next();
            if(this.name.equals("그만"))
                break;

            while (phones.length > i) {

                if (phones[i][0].equals(this.name)){
                    System.out.println(phones[i][0] + "의 번호는" + phones[i][1] + "입니다.");
                    break;
                }
                i++;
            }
            if(i==phones.length)
            System.out.println(this.name+"이 없습니다.");
        }
    }
}


//            i--;
//
//                System.out.println("이름이 없습니다.");
//                run();
//                continue;
//
//                else if(this.name=="그만")
//                    break;
//                else
//                    continue;
//        }
