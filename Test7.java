import java.util.Scanner;

public class Test7 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[10];
        double sum=0;
        System.out.print("랜덤한 정수들 : ");

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        System.out.print("평균은"+sum/arr.length);
    }
}
