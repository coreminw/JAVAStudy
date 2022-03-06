import java.util.Scanner;

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (word.equals(kor[i])) {
                return eng[i];
            }
        }
        return null;
    }
}

public class DicApp {
    Scanner sc = new Scanner(System.in);

    public void run(){
        while(true) {
            System.out.println("한글단어?");
            String ans = sc.next();
            if (ans.equals("그만")) {
                break;
            }
            String ans2= Dictionary.kor2Eng(ans);
            if(ans2==(null))
                System.out.println(ans + "는 저의 사전에 없습니다.");
            else
                System.out.println(ans+"은"+ans2);
            }
        }
    public static void main(String[] args) {
        System.out.println("한영 단어 검색 프로그램 입니다.");
        DicApp a= new DicApp();
        a.run();
    }
}