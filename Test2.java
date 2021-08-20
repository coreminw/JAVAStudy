public class Test2 {
    public static void main(String args[]){
        int n [][]={{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
        n[0]= new int[1];//1행
        n[1]= new int[3];//2행
        n[2]= new int[1];//3행...
        n[3]= new int[4];
        n[4]= new int[2];



        for(int i=0; i< n.length; i++) {
            for(int j=0; j<n[i].length; j++)
                System.out.print(n[i][j] + "");
            System.out.println();
        }

    }
}
