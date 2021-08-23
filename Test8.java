import java.util.Scanner;

public class Test8 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("정수 몇개?");
        int a= sc.nextInt();
        int[] arr= new int[a];

        for(int i=0; i<arr.length; i++){
            int b = (int) (Math.random() * 100 + 1);
            arr[i] = b;
            for(int j=0; j<i; j++){
                if(arr[j]==b) {
                    i--;
                    break;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i % 10 == 9) {
                    System.out.println();
            }
        }
    }
}
