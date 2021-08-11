public class ForeachEx0708 {
    public static void main(String args[]){
        int[] intArray = {1,2,3,4,5};
        String[] name= {"aa","bb"};
        int sum = 0;

        for(int k: intArray)
            sum += k;
        System.out.println("합"+ sum);

        for(String y: name)
            System.out.println(y);
    }
}
