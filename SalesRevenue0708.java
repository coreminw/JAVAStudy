public class SalesRevenue0708 {
    public static void main(String args[]){
        int[][] intArray = {{10,10,10,10},{20,20,20,20},{30,30,30,30}};
        double sum = 0;

        for(int i=0; i< intArray.length; i++)
            for(int j=0; j< intArray[i].length; j++)
                sum += intArray[i][j];

            System.out.println("3년총 매출"+sum+"연평균 매출은"+sum/intArray.length);
    }
}
