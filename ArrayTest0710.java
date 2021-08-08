import java.util.Scanner;

public class ArrayTest0710 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] unit= {50000, 10000, 1000, 500, 100, 50, 10, 1};
        System.out.print("금액을 입력하시오>>");
        int num= sc.nextInt();

        for(int i=0; i<unit.length; i++){
            if(num/unit[i] == 0)
            System.out.print("");
            else{
                System.out.println(unit[i] + "원 짜리 :" + num / unit[i] + "개");
                num = num % unit[i];
            }
        }

    }
}
