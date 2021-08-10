public class ContinueExample0707 {
    public static void main(String args[]){
        int i;//i는 변수..?ㅎ sum은 짝수의 합
        int sum=0;
        for(i=1; i<=100; i++){
            if(i%2==1) {
                continue;
            }
            else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
