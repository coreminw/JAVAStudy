//배열의 length 필드를 이용하여 배열 크기만큼 키보드에서 정수를 입력 받고 평균을 구하는 프로그램을 작성하시오.
import java.util.Scanner;

public class ArrayLength0708 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] intArray= new int[5];
        int sum=0;//sum은 전체 합

        for(int i=0; i<intArray.length; i++){
            intArray[i] = sc.nextInt();
            sum += intArray[i];
        }
    System.out.println("평균은"+sum/intArray.length+"입니다.");
    }
}
