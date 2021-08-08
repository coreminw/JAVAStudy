//양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 화면에 출력하는 프로그램을 작성하시오
import java.util.Scanner;//7월8일

public class ArrayAccess {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] intArray= new int[5];
        int min= Integer.MAX_VALUE;;

        for(int i=0; i<5; i++){
            intArray[i]= sc.nextInt();
            if(intArray[i]<min)
                min=intArray[i];
        }
        System.out.print("가장 작은 값은"+min+"입니다.");

    }
}
