public class Test9 {
    public static void main(String args[]){
        int[][] arr= new int[4][4];

        for(int i=0; i<arr.length; i++){//iė ķ
            for(int j=0; j<arr[i].length; j++){//jė ģ“
                arr[i][j]=(int)(Math.random()*10+1);

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//               System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
}
