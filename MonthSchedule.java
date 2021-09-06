//import java.util.Scanner;
//
//
//public class MonthSchedule {
//    Scanner sc = new Scanner(System.in);
//    Day[] days;
//
//    public MonthSchedule(int day) {
//        this.days = new Day[day];
//        for (int i = 0; i < days.length ; i++) {
//            days[i]= new Day();
//        }
//    }
//
//    public void input() {//1번 입력 input이 1일때
//        System.out.print("날짜(1~30)?");
//        int day = sc.nextInt();
//
//        System.out.println("할일(빈칸없이입력)?");
//        String work = sc.next();
//        day--;
//        days[day].set(work);
//    }
//
//    public void view() {//2번 보기
//        System.out.println("날짜(1~30)?");
//        int day = sc.nextInt();
//        day--;
//        System.out.println((day+1)+"의 할일은");
//        days[day].show();
//    }
//
//    public void finish() {//3번 끝내기
//        System.out.print("프로그램을 종료합니다.");
//    }
//
//    public void run() {
//        System.out.println("이번달 스케쥴 관리 프로그램.");
//        while(true) {
//            System.out.print("할일(입력:1, 보기:2, 끝내기:3)");
//            int input = sc.nextInt();
//            switch (input){
//                case 1: input(); break;
//                case 2: view(); break;
//                case 3: finish(); return;//???
//            }
//        }
//    }
//    public static void main(String args[]) {
//        MonthSchedule april = new MonthSchedule(30);//4월달의 할일
//        april.run();
//    }
//}
//
//class Day{
//    String work;//하루의 할일을 나타내는 문자열
//
//    public Day(String work) {//생성자
//        this.work = work;
//    }
//    public void set(String work){
//        this.work=work;
//    }
//    public String get(){
//        return work;
//    }
//    public void show(){
//        if(work==null)
//            System.out.print("없습니다.");
//        else
//            System.out.print(work+"입니다.");
//    }
//}
