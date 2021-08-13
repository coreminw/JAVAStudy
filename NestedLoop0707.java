public class NestedLoop0707 {
    public static void main(String args[]){
        int i,j;//i는 1단부터.. j는 뒤에 곱

        for(i=1; i<10; i++, System.out.println()){
            for(j=1; j<10; j++){
                System.out.println(i+"*"+j+"=" + i*j);
            }
        }
    }
}
