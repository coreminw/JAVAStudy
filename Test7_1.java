public class Test7_1 {
    public static void main(String args[]){
        int[] arr= new int[10];
        double sum=0;

        for(int i=0; i<arr.length; i++){
            int a= (int)(Math.random()*10+1);
            arr[i]=a;
            sum+=arr[i];
        }
        System.out.print("평균은"+sum/arr.length);
    }
}
