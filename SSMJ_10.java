import java.util.Scanner;

class Dictionary {
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String [] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("한글 단어? ");
            word = scanner.next();
            boolean torf = false;
            if(word.equals("그만"))
                break;

            for(int i=0; i<kor.length; i++) {
                if(word.equals(kor[i])){
                    System.out.println(kor[i]+"는"+eng[i]);
                    torf = true;
                    break;
                }
            }
            if(!torf){
                System.out.print(word + "는 사전에 없습니다.");
            }
        }
        return null;
    }
}

public class SSMJ_10 {

    public static void main(String[] args) {
        System.out.println("한영 단어 검색 프로그램입니다.");
        Dictionary path1 = new Dictionary();

        path1.kor2Eng(null);
    }
}