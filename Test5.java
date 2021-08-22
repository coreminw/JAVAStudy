import java.util.Scanner;

public class Test5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] array= new int[10];

        System.out.println("양의 정수 10개를 입력하시오");
        for(int i=0; i<array.length; i++){
            array[i]= sc.nextInt();
            if(array[i]%3==0){
                System.out.print(array[i]+ " ");
            }
            else
                continue;
        }
    }
}
